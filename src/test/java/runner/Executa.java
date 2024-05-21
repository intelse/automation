package runner;

import org.openqa.selenium.firefox.FirefoxDriver;

import driver.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriverFactory{
	
	public static void openBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Duuzim\\Desktop\\Projeto E2E - automacao HTML\\formulario.html");
	}
	
	public static void exitBrowser() {
		driver.quit();
	}

}
