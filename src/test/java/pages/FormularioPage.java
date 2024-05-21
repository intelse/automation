package pages;

import org.openqa.selenium.By;

import metodos.MetodosDeTeste;

public class FormularioPage {

	MetodosDeTeste metodo = new MetodosDeTeste();
	
	public void userRegis(String name, String lName, String dateNasc, String phoneNumb, String msgEsperada, String nameTest) {
		
		metodo.escrever(By.id("name"), name);
		metodo.escrever(By.id("lastName"),lName);
		metodo.escrever(By.id("dateNasc"), dateNasc);
		metodo.escrever(By.id("phoneNumber"), phoneNumb);
		metodo.clic(By.xpath("//button[text()='Enviar']"));
		metodo.getAssert(msgEsperada);
		metodo.screenShot("Cadastro", nameTest);
		
		
		
		
	}
}
