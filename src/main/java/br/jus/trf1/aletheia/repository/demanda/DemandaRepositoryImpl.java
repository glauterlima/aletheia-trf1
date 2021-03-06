package br.jus.trf1.aletheia.repository.demanda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import br.jus.trf1.aletheia.dto.DemandaEstatisticaLote;
import br.jus.trf1.aletheia.model.Demanda;
import br.jus.trf1.aletheia.model.Demanda_;
import br.jus.trf1.aletheia.model.Lote_;
import br.jus.trf1.aletheia.model.Pessoa_;
import br.jus.trf1.aletheia.model.Sistema_;
import br.jus.trf1.aletheia.repository.filter.DemandaFilter;
import br.jus.trf1.aletheia.repository.projection.ResumoDemanda;

public class DemandaRepositoryImpl implements DemandaRepositoryQuery{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<DemandaEstatisticaLote> porLote(LocalDate mesReferencia) {
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<DemandaEstatisticaLote> criteriaQuery = criteriaBuilder.createQuery(DemandaEstatisticaLote.class);
		
		Root<Demanda> root = criteriaQuery.from(Demanda.class);
		
		criteriaQuery.select(criteriaBuilder.construct(DemandaEstatisticaLote.class,
				root.get(Demanda_.lote),
				criteriaBuilder.sum(root.get(Demanda_.valor))));
		
		LocalDate primeiroDia = mesReferencia.withDayOfMonth(1);
		LocalDate ultimoDia = mesReferencia.withDayOfMonth(mesReferencia.lengthOfMonth());
		
		criteriaQuery.where(
				criteriaBuilder.greaterThanOrEqualTo(root.get(Demanda_.data), primeiroDia),
				criteriaBuilder.lessThanOrEqualTo(root.get(Demanda_.data), ultimoDia)); 
				
		criteriaQuery.groupBy(root.get(Demanda_.lote));
		
		TypedQuery<DemandaEstatisticaLote> typedQuery = manager.createQuery(criteriaQuery);
		
		return typedQuery.getResultList();
	}
	
	@Override
	public Page<Demanda> filtrar(DemandaFilter demandaFilter, Pageable pageable) {
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Demanda> criteria = builder.createQuery(Demanda.class);
		Root<Demanda> root = criteria.from(Demanda.class);
		
		Predicate[] predicates = criarRestricoes(demandaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Demanda> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
	
		return new PageImpl<>(query.getResultList(), pageable, total(demandaFilter));
	}


	@Override
	public Page<ResumoDemanda> resumir(DemandaFilter demandaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ResumoDemanda> criteria = builder.createQuery(ResumoDemanda.class);
		Root<Demanda> root = criteria.from(Demanda.class);
		
		criteria.select(builder.construct(ResumoDemanda.class
				, root.get(Demanda_.codigo)
				, root.get(Demanda_.nome)
				, root.get(Demanda_.sistema).get(Sistema_.nome)
				, root.get(Demanda_.pessoa).get(Pessoa_.nome)
				, root.get(Demanda_.lote).get(Lote_.nome)
				, root.get(Demanda_.plataforma)
				, root.get(Demanda_.tipo)
				, root.get(Demanda_.totalPfBruto)
				, root.get(Demanda_.totalPfLiquido)
				, root.get(Demanda_.totalPfPlataforma)
				, root.get(Demanda_.data)
				, root.get(Demanda_.status)
				, root.get(Demanda_.observacao)
				, root.get(Demanda_.valor)));				
				
		
		Predicate[] predicates = criarRestricoes(demandaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<ResumoDemanda> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(demandaFilter));
	}


	private Predicate[] criarRestricoes(DemandaFilter demandaFilter, CriteriaBuilder builder, Root<Demanda> root) {
		
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(demandaFilter.getNome())) {
			predicates.add(builder.like(
					builder.lower(root.get(Demanda_.nome)),"%" + demandaFilter.getNome().toLowerCase() + "%"));
		}
		
		
		if(demandaFilter.getData() != null) {
			predicates.add(
					builder.equal(root.get(Demanda_.data), demandaFilter.getData()));	
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;
		
		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);
		
	}
	

	private Long total(DemandaFilter demandaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Demanda> root = criteria.from(Demanda.class);
		
		Predicate[] predicates = criarRestricoes(demandaFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		
		return manager.createQuery(criteria).getSingleResult();
	}

}
