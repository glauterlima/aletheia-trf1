package br.jus.trf1.aletheia.repository.projection;

import br.jus.trf1.aletheia.model.Plataforma;

public class ResumoDemanda {
	
	private Long codigo;
	private String nome;
	private String sistema;
	private String pessoa;
	private String lote;
	private Plataforma plataforma;
	
	
	public ResumoDemanda(Long codigo, String nome, String sistema, String pessoa, String lote, Plataforma plataforma) {
		this.codigo = codigo;
		this.nome = nome;
		this.sistema = sistema;
		this.pessoa = pessoa;
		this.lote = lote;
		this.plataforma = plataforma;
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


}
