package br.jus.trf1.aletheia.repository.demanda;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.jus.trf1.aletheia.model.Demanda;
import br.jus.trf1.aletheia.repository.filter.DemandaFilter;
import br.jus.trf1.aletheia.repository.projection.ResumoDemanda;

public interface DemandaRepositoryQuery {
	
	public Page<Demanda> filtrar(DemandaFilter demandaFilter, Pageable pageable);
	public Page<ResumoDemanda> resumir(DemandaFilter demandaFilter, Pageable pageable);

}
