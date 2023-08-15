package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.FormularioPage;
import runner.Executa;

//Metodo do JUNIT para ordenar testes

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PrimeiroTeste {

	FormularioPage formulario = new FormularioPage();

	String msgEsperada = "Cadastro realizado com sucesso! \n" + "\n" + "Nome: Larissa\n" + "Sobrenome: Flausino\n"
			+ "Data nascimento: 2002-04-27\n" + "WhatsApp: 11985456325";

	String msgEsperada2 = "Cadastro realizado com sucesso! \n" + "\n" + "Nome: João\n" + "Sobrenome: Pereira\n"
			+ "Data nascimento: 2000-04-27\n" + "WhatsApp: 11985456325";

	@Before
	public void antesDoTeste() {
		Executa.abrirNavegador();
	}

	@After
	public void depoisDoTeste() {
		Executa.fecharNavegador();
	}

	@Test
	public void testCadastrar() {
		formulario.cadastrar("Larissa", "Flausino", "27/04/2002", "11985456325", msgEsperada, "testCadastrar");
	}

	@Test
	public void testCadastrar2() {
		formulario.cadastrar("João", "Pereira", "27/04/2000", "11985456325", msgEsperada2, "testCadastrar2");
	}

	@Test
	public void testCadastrar3() {
		formulario.cadastrar("João", "Pereira", "27/04/2000", "11985456325", msgEsperada2, "testCadastrar3");
	}

	@Test
	public void testCadastrar4() {
		formulario.cadastrar("João", "Pereira", "27/04/2000", "11985456325", msgEsperada2, "testCadastrar4");
	}

}
