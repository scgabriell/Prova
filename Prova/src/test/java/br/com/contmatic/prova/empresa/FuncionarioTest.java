package br.com.contmatic.prova.empresa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FuncionarioTest {
	
	private final String cpf = "48655150894";
	private final String cnpj = "98185004000196";

	
	private Funcionario funcionario;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Iniciando testes da classe Funcionário");
	}
	
	@Before
	public void setUp () {
		System.out.println("Iniciando before");
		Empresa empresa = new Empresa("36618755000100");
		funcionario = new Funcionario("48655150894", empresa);
		
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("Finalizando testes da classe Funcionário");
	}

	@After
	public void tearDown() {
		System.out.println("Executando after");
	}

	@Test
	public void deve_inicializar_funcionarios_com_os_campos_obrigatorios(){
		final String cpf = "48655150894";
		final Empresa empresa = new Empresa("78737983000130");
		Funcionario funcionario = new Funcionario(cpf, empresa);
		assertNotNull(funcionario);
		assertEquals(cpf, funcionario.getCpf());
		assertEquals(empresa, funcionario.getEmpresa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	 public void nao_deve_criar_funcionario_com_empresa_nula() {
		final String cpf = "48655150894";
		Funcionario funcionario = new Funcionario(cpf, null);
		
	}
	
	// Nome 
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_nome_nulo () {
		funcionario.setNome(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_nome_vazio () {
		funcionario.setNome("");
	}
	
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_nome_com_uma_letra () {
		funcionario.setNome("G");
	}
	// TODO NOME COM 61 CARACTERES
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_nome_com_mais_de_60_caracteres () {
		funcionario.setNome("efdfdfdfdfdfdfwfgd fafafagedhdfhfhfhgfds ggghhhhdddddvsabi7dd ");
	}
	// CPF
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atrubuir_cpf_nulo () {
		funcionario.setCpf(null);
	}
	
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_cpf_com_mais_de_11_caracteres() {
		funcionario.setCpf("123456789101");
	}
	
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_cpf_com_menos_de_11_caracteres() {
		funcionario.setCpf("1234");
	}
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_rg_com_menos_de_8_caracteres() {
		funcionario.setRg("7654321");
	}
	
	@Test(expected = IllegalStateException.class)
	public void nao_deve_atribuir_rg_com_mais_de_14_caracteres() {
		funcionario.setRg("345.898.779-999");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_endereco_nulo () {
		funcionario.setEndereco(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_salario_nulo() {
		funcionario.setSalario(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_telefone_nulo() {
		funcionario.setTelefones(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_atribuir_email_nulo() {
		funcionario.setEmails(null);
	}
	
	//@Test(expected = IllegalArgumentException.class)
	//public void nao_deve_atribuir_nulo () {
	//	funcionario.
	//}
}
