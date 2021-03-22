package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AbaDadosPage extends MetodosUteis {

	protected WebDriver driver;
	
	public AbaDadosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Elementos de texto
	@FindBy(how = How.CSS, using = "#nextenterproductdata")
	private WebElement qtNext02;
	
	@FindBy(how = How.CSS, using = "#nextenterproductdata")
	private WebElement txtNext02;
	
	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(1) > label")
	private WebElement txtFirstName;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(2) > label")
	private WebElement txtLastName;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(3) > label")
	private WebElement txtDateOfBirth;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(4) > label")
	private WebElement txtGender;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(5) > label")
	private WebElement txtStreetAddress;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(6) > label")
	private WebElement txtCountry;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(7) > label")
	private WebElement txtZipCode;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(8) > label")
	private WebElement txtCity;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(9) > label")
	private WebElement txtOccupation;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(10) > label")
	private WebElement txtHobbies;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(11) > label")
	private WebElement txtWebsite;

	// Elementos de Campos
	@FindBy(how = How.ID, using = "firstname")
	private WebElement cpFirstName;

	@FindBy(how = How.ID, using = "lastname")
	private WebElement cpLastName;

	@FindBy(how = How.ID, using = "birthdate")
	private WebElement cpDateOfBirth;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span")
	private WebElement cpGender;

	@FindBy(how = How.ID, using = "streetaddress")
	private WebElement cpStreetAddress;

	@FindBy(how = How.ID, using = "country")
	private WebElement cqCountry;

	@FindBy(how = How.CSS, using = "option[value='Brazil']")
	private WebElement sltCountry;

	@FindBy(how = How.ID, using = "zipcode")
	private WebElement cpZipCode;

	@FindBy(how = How.ID, using = "city")
	private WebElement cpCity;

	@FindBy(how = How.ID, using = "occupation")
	private WebElement cqOccupation;

	@FindBy(how = How.CSS, using = "option[value='Public Official']")
	private WebElement sltOccupation;

	@FindBy(how = How.CSS, using = "section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
	private WebElement cpHobbies;

	@FindBy(how = How.ID, using = "website")
	private WebElement cpWebsite;

	// Título
	public void txtFirstName() {
		esperarElemento(txtFirstName);
		assertEquals("First Name", txtFirstName.getText());
	}
	
	public void txtLastName() {
		esperarElemento(txtLastName);
		assertEquals("Last Name", txtLastName.getText());
	}
	
	public void txtDateOfBirth() {
		esperarElemento(txtDateOfBirth);
		assertEquals("Date of Birth", txtDateOfBirth.getText());
	}
	
	public void txtGender() {
		esperarElemento(txtGender);
		assertEquals("Gender", txtGender.getText());
	}
	
	public void txtStreetAddress() {
		esperarElemento(txtStreetAddress);
		assertEquals("Street Address", txtStreetAddress.getText());
	}
	
	public void txtCountry() {
		esperarElemento(txtCountry);
		assertEquals("Country", txtCountry.getText());
	}
	
	public void txtZipCode() {
		esperarElemento(txtZipCode);
		assertEquals("Zip Code", txtZipCode.getText());
	}
	
	public void txtCity() {
		esperarElemento(txtCity);
		assertEquals("City", txtCity.getText());
	}
	
	public void txtOccupation() {
		esperarElemento(txtOccupation);
		assertEquals("Occupation", txtOccupation.getText());
	}
	
	public void txtHobbies() {
		esperarElemento(txtHobbies);
		assertEquals("Hobbies", txtHobbies.getText());
	}
	
	public void txtWebsite() {
		esperarElemento(txtWebsite);
		assertEquals("Website", txtWebsite.getText());
	}
	
	public void txtNext02() {
		esperarElemento(txtNext02);
		assertEquals("Next »", txtNext02.getText());
	}
	
	// Clique
	public void cliqueGender() {
		esperarElemento(cpGender);
		cpGender.click();
	}
	
	public void cliqueHobbies() {
		esperarElemento(cpHobbies);
		cpHobbies.click();
	}
	
	public void cliqueNext02() {
		esperarElemento(qtNext02);
		qtNext02.click();
	}
	
	// Campos de Seleção
	public void selecionarCountry() {
		esperarElemento(cqCountry);
		cqCountry.click();
		sltCountry.click();
	}
	
	public void selecionarOccupation() {
		esperarElemento(cqOccupation);
		cqOccupation.click();
		sltOccupation.click();
	}
	
	// Campos de Preenchimento
	public void preencheCampoFirstName(String firstName) {
		esperarElemento(cpFirstName);
		cpFirstName.sendKeys(firstName);
	}
	
	public void preencheCampoLastName(String lastName) {
		esperarElemento(cpLastName);
		cpLastName.sendKeys(lastName);
	}
	
	public void preencheCampoDateOfBirth(String arg1) {
		esperarElemento(cpDateOfBirth);
		cpDateOfBirth.sendKeys(arg1);
	}
	
	public void preencheCampoStreetAddress(String streetAddress) {
		esperarElemento(cpStreetAddress);
		cpStreetAddress.sendKeys(streetAddress);
	}
	
	public void preencheCampoZipCode(String zipCode) {
		esperarElemento(cpZipCode);
		cpZipCode.sendKeys(zipCode);
	}
	
	public void preencheCampoCity(String city) {
		esperarElemento(cpCity);
		cpCity.sendKeys(city);
	}
	
	public void preencheCampoWebsite(String website) {
		esperarElemento(cpWebsite);
		cpWebsite.sendKeys(website);
	}

}
