package br.com.contmatic.prova.empresa;

import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_CNPJ_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_EMAIL_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_ENDERECO_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_ERRO_NOME_FANTASIA;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_ERRO_RAZAO_SOCIAL;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_NOME_FANTASIA_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_RAZAO_SOCIAL_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.MSG_TELEFONE_NULO;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.TAMANHO_MAX_NOME_FANTASIA;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.TAMANHO_MAX_RAZAO_SOCIAL;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.TAMANHO_MIN_NOME_FANTASIA;
import static br.com.contmatic.prova.util.constantes.EmpresaConstantes.TAMANHO_MIN_RAZAO_SOCIAL;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarNulo;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarTamanho;

import java.util.List;
import java.util.Objects;

import br.com.contmatic.prova.contato.Email;
import br.com.contmatic.prova.contato.Telefone;
import br.com.contmatic.prova.endereco.Endereco;
import br.com.contmatic.prova.util.constantes.EmpresaConstantes;
import br.com.contmatic.prova.util.validacao.ValidacaoUtil;

public class Empresa {
	
	private String cnpj;
	
	private String razaoSocial;
	
	private String nomeFantasia;
	
	private List<Endereco> enderecos;
	
	private List<Telefone> telefones;
	
	private List<Email> emails;
	
	private List<Funcionario> funcionarios;
	
	public Empresa(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		validarNulo(cnpj, MSG_CNPJ_NULO);
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		validarNulo(razaoSocial, MSG_RAZAO_SOCIAL_NULO);
		validarTamanho(razaoSocial, TAMANHO_MIN_RAZAO_SOCIAL, TAMANHO_MAX_RAZAO_SOCIAL, MSG_ERRO_RAZAO_SOCIAL);
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		validarNulo(nomeFantasia, MSG_NOME_FANTASIA_NULO);
		validarTamanho(nomeFantasia, TAMANHO_MIN_NOME_FANTASIA, TAMANHO_MAX_NOME_FANTASIA, MSG_ERRO_NOME_FANTASIA);
		this.nomeFantasia = nomeFantasia;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		validarNulo(enderecos, MSG_ENDERECO_NULO);
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefone(List<Telefone> telefone) {
		validarNulo(telefone, MSG_TELEFONE_NULO);
		this.telefones = telefone;
	}

	public List<Email> getEmail() {
		return emails;
	}

	public void setEmail(List<Email> emails) {
		validarNulo(emails, MSG_EMAIL_NULO);
		this.emails = emails;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Empresa [cnpj=");
		builder.append(cnpj);
		builder.append(", nome=");
		builder.append(nomeFantasia);
		builder.append(", razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", endereco=");
		builder.append(enderecos);
		builder.append(", telefone=");
		builder.append(telefones);
		builder.append(", email=");
		builder.append(emails);
		builder.append("]");
		return builder.toString();
	}
    
}
