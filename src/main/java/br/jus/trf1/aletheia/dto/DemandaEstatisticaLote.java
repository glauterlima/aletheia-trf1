package br.jus.trf1.aletheia.dto;

import java.math.BigDecimal;

import br.jus.trf1.aletheia.model.Lote;

public class DemandaEstatisticaLote {
	
	private Lote lote;
	
	private BigDecimal total;

	public DemandaEstatisticaLote(Lote lote, BigDecimal total) {
		this.lote = lote;
		this.total = total;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
