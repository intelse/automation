package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.FormularioPage;
import runner.Executa;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StepsTest {
	FormularioPage form = new FormularioPage();
	
	@Before
	public void initTest() {
		Executa.openBrowser();
	}
	
	@After
	public void endTest() {
		Executa.exitBrowser();
	}
	
	@Test
	public void cadastroUser() {
		form.userRegis("Jean", "Adalberto", "1993-09-22", "18997897701", "Cadastro realizado com sucesso!\n" + "\n" + "Nome: Jean\n" + "Sobrenome: Adalberto\n" + "Data de Nascimento: 1993-09-22\n" + "Whatsapp: 18997897701", "cadastroUser");
	}
	
	@Test
	public void cadastroUser1() {
		form.userRegis("Adalberto", "Matos", "1993-01-04", "18997897701", "Cadastro realizado com sucesso!\n" + "\n" + "Nome: Adalberto\n" + "Sobrenome: Matos\n" + "Data de Nascimento: 1993-01-04\n" + "Whatsapp: 18997897701", "cadastroUser1");
	}
	
	@Test
	public void cadastroUser2() {
		form.userRegis("Tomas", "Lact", "1993-02-12", "18997897701", "Cadastro realizado com sucesso!\n" + "\n" + "Nome: Tomas\n" + "Sobrenome: Lact\n" + "Data de Nascimento: 1993-02-12\n" + "Whatsapp: 18997897701", "cadastroUser2");
	}
}
