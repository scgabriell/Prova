package br.com.contmatic.prova.empresa;

import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_CPF_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_CPF_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_EMAIL_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_EMAIL_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_EMPRESA_NULA;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_ENDERECO_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_ENDERECO_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_ERRO_CPF;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_ERRO_NOME;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_ERRO_RG;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_NOME_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_NOME_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_RG_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_RG_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_SALARIO_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_SALARIO_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_TELEFONE_NULO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.MSG_TELEFONE_VAZIO;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.TAMANHO_MAX_CPF;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.TAMANHO_MAX_NOME;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.TAMANHO_MAX_RG;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.TAMANHO_MIN_NOME;
import static br.com.contmatic.prova.util.constantes.FuncionarioConstantes.TAMANHO_MIN_RG;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarNulo;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarTamanho;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.validarVazio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import br.com.contmatic.prova.contato.Email;
import br.com.contmatic.prova.contato.Telefone;
import br.com.contmatic.prova.endereco.Endereco;
import br.com.contmatic.prova.util.constantes.FuncionarioConstantes;
import br.com.contmatic.prova.util.validacao.ValidacaoUtil;

public class Funcionario {

	private String cpf;
	
	private String nome;
	
	private String rg;
	
	private Endereco endereco;
	
	private BigDecimal salario;
	
	private LocalDate dataNascimento;
	
	private Empresa empresa;
	
	private List<Telefone> telefones;
	
	private List <Email> emails;

	public Funcionario(String cpf, Empresa empresa) {
		setCpf(cpf);
		setEmpresa(empresa);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		validarNulo(cpf, MSG_CPF_NULO);
		validarVazio(cpf, MSG_CPF_VAZIO);
		validarTamanho(cpf, TAMANHO_MAX_CPF, TAMANHO_MAX_CPF, MSG_ERRO_CPF);
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		validarNulo(nome, MSG_NOME_NULO);
		validarVazio(nome, MSG_NOME_VAZIO);
		validarTamanho(nome, TAMANHO_MIN_NOME, TAMANHO_MAX_NOME, MSG_ERRO_NOME);
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		validarNulo(rg, MSG_RG_NULO);
		validarVazio(rg, MSG_RG_VAZIO);
		validarTamanho(rg, TAMANHO_MIN_RG, TAMANHO_MAX_RG, MSG_ERRO_RG);
		this.rg = rg;

	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		validarNulo(endereco, MSG_ENDERECO_NULO);
		validarVazio(endereco, MSG_ENDERECO_VAZIO);
		this.endereco = endereco;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		validarNulo(salario, MSG_SALARIO_NULO);
		validarVazio(salario, MSG_SALARIO_VAZIO);
		this.salario = salario;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
		validarNulo(empresa, MSG_EMPRESA_NULA);
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		validarNulo(telefones, MSG_TELEFONE_NULO);
		validarVazio(telefones, MSG_TELEFONE_VAZIO);
		this.telefones = telefones;

	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		validarNulo(emails, MSG_EMAIL_NULO);
		validarVazio(emails, MSG_EMAIL_VAZIO);
		this.emails = emails;

	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, empresa);
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
		return Objects.equals(cpf, other.cpf) && Objects.equals(empresa, other.empresa);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [cpf=");
		builder.append(cpf);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", rg=");
		builder.append(rg);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", empresa=");
		builder.append(empresa);
		builder.append(", telefones=");
		builder.append(telefones);
		builder.append(", emails=");
		builder.append(emails);
		builder.append("]");
		return builder.toString();
	}

}
