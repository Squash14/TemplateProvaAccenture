package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AbaProtudoPage extends MetodosUteis{


protected WebDriver driver;
	
	public AbaProtudoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	// Elementos de texto
		@FindBy(how = How.CSS, using = "#nextselectpriceoption")
		private WebElement qtNext03;
		
		@FindBy(how = How.CSS, using = "#nextselectpriceoption")
		private WebElement txtNext03;
		
		@FindBy(how = How.CSS, using = " section:nth-child(3) > div:nth-child(1) > label")
		private WebElement txtStartDate;
		
		@FindBy(how = How.CSS, using = "section:nth-child(3) > div:nth-child(2) > label")
		private WebElement txtInsuranceSum;
		
		@FindBy(how = How.CSS, using = "section:nth-child(3) > div:nth-child(3) > label")
		private WebElement txtMeritRating;
		
		@FindBy(how = How.CSS, using = "section:nth-child(3) > div:nth-child(4) > label")
		private WebElement txtDamageInsurance;
		
		@FindBy(how = How.CSS, using = "section:nth-child(3) > div:nth-child(5) > label")
		private WebElement txtOptionalProducts;
		
		@FindBy(how = How.CSS, using = "section:nth-child(3) > div:nth-child(6) > label")
		private WebElement txtCourtesyCar;
		
		// Elementos de Campos
		@FindBy(how = How.ID, using = "startdate")
		private WebElement cpStartDate;
		
		@FindBy(how = How.ID, using = "insurancesum")
		private WebElement cqInsuranceSum;

		@FindBy(how = How.CSS, using = "#insurancesum > option:nth-child(2)")
		private WebElement sltInsuranceSum;
		
		@FindBy(how = How.ID, using = "meritrating")
		private WebElement cqMeritRating;

		@FindBy(how = How.CSS, using = "option[value='Bonus 1']")
		private WebElement sltMeritRating;
		
		@FindBy(how = How.ID, using = "damageinsurance")
		private WebElement cqDamageInsurance;

		@FindBy(how = How.CSS, using = "option[value='No Coverage']")
		private WebElement sltDamageInsurance;
		
		@FindBy(how = How.CSS, using = "#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
		private WebElement cqOptionalProducts;
		
		@FindBy(how = How.ID, using = "courtesycar")
		private WebElement cqCourtesyCar;

		@FindBy(how = How.CSS, using = "option[value='Yes']")
		private WebElement sltCourtesyCar;
		
		// Título
		public void txtStartDate() {
			esperarElemento(txtStartDate);
			assertEquals("Start Date", txtStartDate.getText());
		}
		
		public void txtInsuranceSum() {
			esperarElemento(txtInsuranceSum);
			assertEquals("Insurance Sum [$]", txtInsuranceSum.getText());
		}
		
		public void txtMeritRating() {
			esperarElemento(txtMeritRating);
			assertEquals("Merit Rating", txtMeritRating.getText());
		}
		
		public void txtDamageInsurance() {
			esperarElemento(txtDamageInsurance);
			assertEquals("Damage Insurance", txtDamageInsurance.getText());
		}
		
		public void txtOptionalProducts() {
			esperarElemento(txtOptionalProducts);
			assertEquals("Optional Products", txtOptionalProducts.getText());
		}
		
		public void txtCourtesyCar() {
			esperarElemento(txtCourtesyCar);
			assertEquals("Courtesy Car", txtCourtesyCar.getText());
		}
		
		public void txtNext03() {
			esperarElemento(txtNext03);
			assertEquals("Next »", txtNext03.getText());
		}
		
		// Campos de Seleção
		public void selecionarInsuranceSum() {
			esperarElemento(cqInsuranceSum);
			cqInsuranceSum.click();
			sltInsuranceSum.click();
		}
		
		public void selecionarMeritRating() {
			esperarElemento(cqMeritRating);
			cqMeritRating.click();
			sltMeritRating.click();
		}
		
		public void selecionarDamageInsurance() {
			esperarElemento(cqDamageInsurance);
			cqDamageInsurance.click();
			sltDamageInsurance.click();
		}
		
		public void selecionarCourtesyCar() {
			esperarElemento(cqCourtesyCar);
			cqCourtesyCar.click();
			sltCourtesyCar.click();
		}
		
		// Campos de Preenchimento
		public void preencheCampoStartDate(String startDate) {
			esperarElemento(cpStartDate);
			cpStartDate.sendKeys(startDate);
		}
		
		// Clique
		public void cliqueOptionalProducts() {
			esperarElemento(cqOptionalProducts);
			cqOptionalProducts.click();
		}
		
		public void cliqueNext03() {
			esperarElemento(qtNext03);
			qtNext03.click();
		}
		
		
}
