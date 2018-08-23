package br.jus.trf1.aletheia.repository.projection;

public class ResumoDemanda {
	
	private Long codigo;
	private String nome;
	private String sistema;
	private String pessoa;
	
	public ResumoDemanda(Long codigo, String nome, String sistema, String pessoa) {
		this.codigo = codigo;
		this.nome = nome;
		this.sistema = sistema;
		this.pessoa = pessoa;
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
	

}
