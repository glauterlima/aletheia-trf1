package br.jus.trf1.aletheia.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "demanda")
public class Demanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	@NotNull
	private String nome;	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_sistema")
	private Sistema sistema;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_pessoa")
	private Pessoa pessoa;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_lote")
	private Lote lote;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Plataforma plataforma;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@NotNull
	@Column(name = "total_pf_bruto")
	private BigDecimal totalPfBruto;
	
	@NotNull
	@Column(name = "total_pf_liquido")
	private BigDecimal totalPfLiquido;
	
	@NotNull
	@Column(name = "total_pf_plataforma")
	private BigDecimal totalPfPlataforma;
	
	@NotNull
	private LocalDate data;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private String observacao;
	
	@NotNull
	private BigDecimal valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demanda other = (Demanda) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}	