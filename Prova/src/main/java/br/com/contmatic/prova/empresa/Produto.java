package br.com.contmatic.prova.empresa;

import java.math.BigDecimal;



public class Produto {
	
	private String codigo;
	
	private String nome;
	
	private String cor;
	
	private BigDecimal preco;
	
	private String marca;
	
	private Integer qtdEstoque;

	public Produto(String codigo, BigDecimal preco) {
		
		this.codigo = codigo;
		this.preco = preco;
	}

	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", preco=");
		builder.append(preco);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", qtdEstoque=");
		builder.append(qtdEstoque);
		builder.append("]");
		return builder.toString();
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
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}


