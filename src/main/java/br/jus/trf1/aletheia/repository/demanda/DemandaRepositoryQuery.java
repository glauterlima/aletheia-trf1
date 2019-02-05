package br.jus.trf1.aletheia.repository.demanda;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.jus.trf1.aletheia.dto.DemandaEstatisticaLote;
import br.jus.trf1.aletheia.model.Demanda;
import br.jus.trf1.aletheia.repository.filter.DemandaFilter;
import br.jus.trf1.aletheia.repository.projection.ResumoDemanda;

public interface DemandaRepositoryQuery {
	
	public List<DemandaEstatisticaLote> porLote(LocalDate mesReferencia);
	
	public Page<Demanda> filtrar(DemandaFilter demandaFilter, Pageable pageable);
	public Page<ResumoDemanda> resumir(DemandaFilter demandaFilter, Pageable pageable);

}
