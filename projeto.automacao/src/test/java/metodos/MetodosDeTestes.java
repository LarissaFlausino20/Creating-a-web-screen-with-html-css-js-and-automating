package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarTexto(By elemento, String textoExperado) {
		String textoCapturadoDoElemento = driver.findElement(elemento).getText();
		assertEquals(textoExperado, textoCapturadoDoElemento);
	}

	public void validarMsgAlert(String textoEsperado) {
		String msgAlert = driver.switchTo().alert().getText();
		System.out.println(msgAlert);
		assertTrue(msgAlert.contains(textoEsperado));

	}

	public void capturarScreenshot(String historia, String nomeDoArquivo) {
		String timestamp = new SimpleDateFormat("ddMMYYYY").format(new Date());
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot,
					new File("./evidencias" + historia + "/" + timestamp + nomeDoArquivo + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
