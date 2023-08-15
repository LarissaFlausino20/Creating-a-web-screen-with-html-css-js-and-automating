package pages;

import org.openqa.selenium.By;
import drivers.DriversFactory;
import metodos.MetodosDeTestes;

public class FormularioPage extends DriversFactory {

	By nome = By.id("nome");
	By sobrenome = By.id("sobrenome");
	By dataNascimento = By.id("dataNascimento");
	By whatsapp = By.id("whatsApp");
	By cadastrar = By.xpath("//button[@type='submit']");

	MetodosDeTestes metodo = new MetodosDeTestes();

	public void cadastrar(String nome, String sobrenome, String dataNascimento, String whatsapp,
			String textoParaValidar, String nomeDoTeste) {
		metodo.escrever(this.nome, nome);
		metodo.escrever(this.sobrenome, sobrenome);
		metodo.escrever(this.dataNascimento, dataNascimento);
		metodo.escrever(this.whatsapp, whatsapp);
		metodo.capturarScreenshot("Cadastro", nomeDoTeste);
		metodo.clicar(this.cadastrar);
		metodo.validarMsgAlert(textoParaValidar);

	}

}
