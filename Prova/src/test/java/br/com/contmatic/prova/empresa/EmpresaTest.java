package br.com.contmatic.prova.empresa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

import org.junit.Test;

public class EmpresaTest {
	
	private final String cnpj = "98185004000196";
	
	private Empresa empresa;
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Iniciando testes da classe Empresa");
	}
	
	@Before
	public void setUp() {
		System.out.println("Executando before");
		empresa = new Empresa("55053634000102");
	}
	
	@After
	public void tearDown() {
		System.out.println("Executando after");
		empresa = null;
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Finalizando testes da classe Empresa");
	}
			 
	@Test
	public void deve_inicializar_objeto_empresa_com_os_campos_obrigatorios() {
		final String cnpj = "98185004000196";
		empresa = new Empresa(cnpj);
		assertEquals(cnpj, empresa.getCnpj());
	}
	
	// CNPJ
	@Test
	public void deve_atribuir_cnpj() {
		final String cnpj = "37175071000135";
		empresa = new Empresa(cnpj);
		assertEquals(cnpj, empresa.getCnpj());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_cnpj_nulo() {
		empresa.setCnpj(null);
	}
	
	// Razão Social
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_razao_social_nula() {
		empresa.setRazaoSocial(null);
	}
	
	// Nome Fanstasia
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_nome_fantasia_nulo() {
		empresa.setNomeFantasia(null);
	}
	
	// Endereço
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_endereco_nulo() {
		empresa.setEnderecos(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_lista_de_endereco_nula() {
	//	List <Endereco>
		
		
	}
	
}	
		
		
			
			
	
	


