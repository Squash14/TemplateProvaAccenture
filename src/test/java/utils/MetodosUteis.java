package utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.Hooks;
import org.openqa.selenium.support.ui.Select;

public class MetodosUteis {
	
	protected WebDriver driver;
	
	@FindBy(how = How.CSS, using = "ng-component > nav > ol > li")
	private WebElement dashboard;
	
	@FindBy(how = How.CSS, using = "#login")
	private WebElement txtLogin;
	
	public void esperarElemento(WebElement elemento) {
		
		driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void selecionar(WebElement elemento, String texto) {
		driver = Hooks.getDriver();
		Select dropDown = new Select(elemento);
		dropDown.selectByVisibleText(texto);
	}
	
	public void validarDashboard() {
		// Gráfico de infecção Covid-19 no DF
		esperarElemento(dashboard);
		assertTrue(dashboard.isEnabled());
	}
	
	public void tituloLogin() {
		esperarElemento(txtLogin);
		assertEquals("Login", txtLogin.getText());
	}
}
