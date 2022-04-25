package br.com.contmatic.prova.endereco;

public class Endereco {
	
	private String cep;
	
	private String cidade;
	
	private String bairro;
	
	private String logradouro;
	
	private String nome;
	
	private Integer numero;

	private String complemento;

	public Endereco(String cep, String cidade, String bairro, String logradouro, String nome, Integer numero) {
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.nome = nome;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
