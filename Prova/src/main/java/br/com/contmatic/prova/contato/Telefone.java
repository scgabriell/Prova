package br.com.contmatic.prova.contato;

import br.com.contmatic.prova.endereco.DDD;
import br.com.contmatic.prova.endereco.DDI;

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
	
	
	
}
