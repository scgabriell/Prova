package br.com.contmatic.prova.endereco;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, logradouro, nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [cep=");
		builder.append(cep);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append(", logradouro=");
		builder.append(logradouro);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
