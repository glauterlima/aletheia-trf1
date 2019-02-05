package br.jus.trf1.aletheia.dto;

import java.math.BigDecimal;

import br.jus.trf1.aletheia.model.Sistema;

public class DemandaEstatisticaSistema {
	
	private Sistema sistema;
	
	private BigDecimal total;

	public DemandaEstatisticaSistema(Sistema sistema, BigDecimal tota) {
		this.sistema = sistema;
		this.total = tota;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public BigDecimal getTota() {
		return total;
	}

	public void setTota(BigDecimal tota) {
		this.total = tota;
	}
	
	

}
