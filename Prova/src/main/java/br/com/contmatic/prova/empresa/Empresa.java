package br.com.contmatic.prova.empresa;

import java.util.List;
import java.util.Objects;

import br.com.contmatic.prova.contato.Email;
import br.com.contmatic.prova.contato.Telefone;
import br.com.contmatic.prova.endereco.Endereco;

public class Empresa {
	
	private String cnpj;
	
	private String nome;
	
	private String razaoSocial;
	
	private List<Endereco> endereco;
	
	private List<Telefone> telefone;
	
	private List<Email> email;
	
	
	
	public Empresa(String cnpj) {
		this.cnpj = cnpj;
	}


	// Getters and Setters
	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}


	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}


	public List<Telefone> getTelefone() {
		return telefone;
	}


	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}


	public List<Email> getEmail() {
		return email;
	}


	public void setEmail(List<Email> email) {
		this.email = email;
	}
	
	



	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Empresa other = (Empresa) obj;
		return Objects.equals(cnpj, other.cnpj);
	}



	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", razaoSocial=" + razaoSocial + ", endereço=" + endereco + ", CNPJ=" + cnpj
				+ ", municipio="  + ", telefone=" + telefone + "]";
	}
	

    
}
