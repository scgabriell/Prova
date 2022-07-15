package br.com.contmatic.prova.contato;

import java.util.Objects;

public class Telefone {

	private DDI ddi;
	
	private DDD ddd;
	
	private Integer numero;
	
	private TipoTelefone tipo;

	public Telefone(DDI ddi, DDD ddd, Integer numero) {
		
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
	}

	public DDI getDdi() {
		return ddi;
	}

	public void setDdi(DDI ddi) {
		this.ddi = ddi;
	}

	public DDD getDdd() {
		return ddd;
	}

	public void setDdd(DDD ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefone [ddi=");
		builder.append(ddi);
		builder.append(", ddd=");
		builder.append(ddd);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(ddd, ddi, numero, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return ddd == other.ddd && ddi == other.ddi && Objects.equals(numero, other.numero) && tipo == other.tipo;
	}
	
	
	
}
