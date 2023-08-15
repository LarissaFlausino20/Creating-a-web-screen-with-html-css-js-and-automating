package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/laris/Downloads/formulario.html?");

	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
