package br.com.contmatic.prova.empresa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.contmatic.prova.empresa.Produto;


public class ProdutoTest {
	

	private Produto produto;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Iniciando testes da classe Produto");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("Finalizando testes da classe Produto");
	}

	@After
	public void tearDown()  {
		System.out.println("Executando after");
	}

	@Test
	public void deve_iniciar_objeto_produto_com_atributos_obrigatorios() {
		final String codigo = "1234";
		//produto = new Produto
	}

}
