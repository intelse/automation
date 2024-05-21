package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriverFactory;

public class MetodosDeTeste extends DriverFactory {

	public void escrever(By elemento, String text) {
		driver.findElement(elemento).sendKeys(text);
	}

	public void clic(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarText(By elemento, String textoEsp) {
		String text = driver.findElement(elemento).getText();
		assertTrue(text.contains(textoEsp));
	}

	public void getAssert(String textEsperado) {
		String alert = driver.switchTo().alert().getText();
		assertTrue(alert.contains(textEsperado));
		driver.switchTo().alert().accept();
	}

	public void screenShot(String story, String nameEvid) {
		File evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(evidencia, new File("./evidencias/" + story + "/" + nameEvid + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
