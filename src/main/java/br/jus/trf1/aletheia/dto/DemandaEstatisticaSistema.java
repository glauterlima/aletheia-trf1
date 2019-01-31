package br.jus.trf1.aletheia.dto;

import java.math.BigDecimal;

import br.jus.trf1.aletheia.model.Sistema;

public class DemandaEstatisticaSistema {
	
	private Sistema sistema;
	
	private BigDecimal tota;

	public DemandaEstatisticaSistema(Sistema sistema, BigDecimal tota) {
		this.sistema = sistema;
		this.tota = tota;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public BigDecimal getTota() {
		return tota;
	}

	public void setTota(BigDecimal tota) {
		this.tota = tota;
	}
	
	

}
