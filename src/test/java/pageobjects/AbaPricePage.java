package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AbaPricePage extends MetodosUteis {

	protected WebDriver driver;

	public AbaPricePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Elementos de texto
	@FindBy(how = How.CSS, using = "#nextsendquote")
	private WebElement qtNext04;

	@FindBy(how = How.CSS, using = "#nextsendquote")
	private WebElement txtNext04;

	@FindBy(how = How.CSS, using = "#priceTable > tfoot > tr > th:nth-child(1)")
	private WebElement txtSelectOption;

	// Elementos de Campos
	@FindBy(how = How.CSS, using = "#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")
	private WebElement cqSelectOption;

	// Título
	public void txtSelectOption() {
		esperarElemento(txtSelectOption);
		assertEquals("Select Option", txtSelectOption.getText());
	}
	
	public void txtNext04() {
		esperarElemento(txtNext04);
		assertEquals("Next »", txtNext04.getText());
	}
	
	// Clique
	public void cliqueSelectOption() {
		esperarElemento(cqSelectOption);
		cqSelectOption.click();
	}
	
	public void cliqueNext04() {
		esperarElemento(qtNext04);
		qtNext04.click();
	}
}
