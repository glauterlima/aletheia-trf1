package br.jus.trf1.aletheia.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.jus.trf1.aletheia.model.Plataforma;
import br.jus.trf1.aletheia.model.Status;
import br.jus.trf1.aletheia.model.Tipo;

public class ResumoDemanda {
	
	private Long codigo;
	private String nome;
	private String sistema;
	private String pessoa;
	private String lote;
	private Plataforma plataforma;
	private Tipo tipo;
	private BigDecimal totalPfBruto;
	private BigDecimal totalPfLiquido;
	private BigDecimal totalPfPlataforma;
	private LocalDate data;
	private Status status;
	private String observacao;
	private BigDecimal valor;
	
	
	
	public ResumoDemanda(Long codigo, String nome, String sistema, String pessoa, String lote, Plataforma plataforma, Tipo tipo, BigDecimal totalPfBruto,
			BigDecimal totalPfLiquido, BigDecimal totalPfPlataforma, LocalDate data, Status status, String observacao, BigDecimal valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.sistema = sistema;
		this.pessoa = pessoa;
		this.lote = lote;
		this.plataforma = plataforma;
		this.tipo = tipo;
		this.totalPfBruto = totalPfBruto;
		this.totalPfLiquido = totalPfLiquido;
		this.totalPfPlataforma = totalPfPlataforma;
		this.data = data;
		this.status = status;
		this.observacao = observacao;
		this.valor = valor;
	}	
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public BigDecimal getTotalPfBruto() {
		return totalPfBruto;
	}


	public void setTotalPfBruto(BigDecimal totalPfBruto) {
		this.totalPfBruto = totalPfBruto;
	}


	public BigDecimal getTotalPfLiquido() {
		return totalPfLiquido;
	}


	public void setTotalPfLiquido(BigDecimal totalPfLiquido) {
		this.totalPfLiquido = totalPfLiquido;
	}


	public BigDecimal getTotalPfPlataforma() {
		return totalPfPlataforma;
	}


	public void setTotalPfPlataforma(BigDecimal totalPfPlataforma) {
		this.totalPfPlataforma = totalPfPlataforma;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	


}
