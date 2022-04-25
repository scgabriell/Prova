package br.com.contmatic.prova.empresa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.contmatic.prova.contato.Email;
import br.com.contmatic.prova.contato.Telefone;

public class Funcionario {

	private String cpf;
	
	private String nome;
	
	private String rg;
	
	private String endereco;
	
	private BigDecimal salario;
	
	private LocalDate dtNascimento;
	
	private List<Telefone> telefone;
	
	private List <Email> email;
	 

	public Funcionario(String cpf) {
		this.cpf = cpf;
	}

	// Getters and Setters
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	
	
	
	public List <Email> getEmail() {
		return email;
	}

	public void setEmail(List <Email> email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
}
