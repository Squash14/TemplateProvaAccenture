package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AbaVeiculoPage extends MetodosUteis {

	protected WebDriver driver;

	public AbaVeiculoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Elementos de texto
	@FindBy(how = How.CSS, using = "li #entervehicledata span")
	private WebElement qtCamposAbaVeiculo;
	
	@FindBy(how = How.CSS, using = "#nextenterinsurantdata")
	private WebElement qtNext01;
	
	@FindBy(how = How.CSS, using = "#nextenterinsurantdata")
	private WebElement txtNext01;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(1) > label ")
	private WebElement txtMake;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(2) > label ")
	private WebElement txtModel;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(3) > label ")
	private WebElement txtCylindercapacity;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(4) > label ")
	private WebElement txtEnginePerformance;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(5) > label ")
	private WebElement txtDateofmanufacture;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(6) > label ")
	private WebElement txtNumberOfSeats;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(7) > label ")
	private WebElement txtRightHandDrive;
	
	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(8) > label ")
	private WebElement txtNumberSeats;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(9) > label ")
	private WebElement txtFuelType;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(10) > label ")
	private WebElement txtPayload;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(11) > label ")
	private WebElement txtTotalWeight;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(12) > label ")
	private WebElement txtListPrice;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(13) > label ")
	private WebElement txtLicensePlateNumbere;

	@FindBy(how = How.CSS, using = "section:nth-child(1) > div:nth-child(14) > label")
	private WebElement txtAnnualMileage;

	// Elementos de Campos
	@FindBy(how = How.ID, using = "make")
	private WebElement cqMake;

	@FindBy(how = How.CSS, using = "option[value='Audi']")
	private WebElement sltMake;

	@FindBy(how = How.ID, using = "model")
	private WebElement cqModel;

	@FindBy(how = How.CSS, using = "option[value='Scooter']")
	private WebElement sltModel;

	@FindBy(how = How.ID, using = "cylindercapacity")
	private WebElement cpCylinderCapacity;

	@FindBy(how = How.ID, using = "engineperformance")
	private WebElement cpEnginePerformance;

	@FindBy(how = How.ID, using = "dateofmanufacture")
	private WebElement cpDateOfManufacture;

	@FindBy(how = How.ID, using = "numberofseats")
	private WebElement cqNumberOfSeats;

	@FindBy(how = How.CSS, using = "option[value='3']")
	private WebElement sltNumberOfSeats;

	@FindBy(how = How.CSS, using = " section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span")
	private WebElement cpRightHandDrive;
	
	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	private WebElement cqNumberSeats;

	@FindBy(how = How.CSS, using = "#numberofseatsmotorcycle > option:nth-child(2)")
	private WebElement sltNumberSeats;

	@FindBy(how = How.ID, using = "fuel")
	private WebElement cqFuelType;

	@FindBy(how = How.CSS, using = "option[value='Petrol']")
	private WebElement sltFuelType;

	@FindBy(how = How.ID, using = "payload")
	private WebElement cpPayload;

	@FindBy(how = How.ID, using = "totalweight")
	private WebElement cpTotalWeight;

	@FindBy(how = How.ID, using = "listprice")
	private WebElement cpListPrice;

	@FindBy(how = How.ID, using = "licenseplatenumber")
	private WebElement cpLicensePlateNumber;

	@FindBy(how = How.ID, using = "annualmileage")
	private WebElement cpAnnualMileage;

	// Título
	public void qtCamposAbaVeiculo() {
		esperarElemento(qtCamposAbaVeiculo);
		assertEquals("12", qtCamposAbaVeiculo.getText());
	}

	public void txtMake() {
		esperarElemento(txtMake);
		assertEquals("Make", txtMake.getText());
	}

	public void txtModel() {
		esperarElemento(txtModel);
		assertEquals("Model", txtModel.getText());
	}

	public void txtCylindercapacity() {
		esperarElemento(txtCylindercapacity);
		assertEquals("Cylinder Capacity [ccm]", txtCylindercapacity.getText());
	}

	public void txtEnginePerformance() {
		esperarElemento(txtEnginePerformance);
		assertEquals("Engine Performance [kW]", txtEnginePerformance.getText());
	}

	public void txtDateofmanufacture() {
		esperarElemento(txtDateofmanufacture);
		assertEquals("Date of Manufacture", txtDateofmanufacture.getText());
	}

	public void txtNumberOfSeats() {
		esperarElemento(txtNumberOfSeats);
		assertEquals("Number of Seats", txtNumberOfSeats.getText());
	}

	public void txtRightHandDrive() {
		esperarElemento(txtRightHandDrive);
		assertEquals("Right Hand Drive", txtRightHandDrive.getText());
	}
	
	public void txtNumberSeats() {
		esperarElemento(txtNumberSeats);
		assertEquals("Number of Seats", txtNumberSeats.getText());
	}

	public void txtFuelType() {
		esperarElemento(txtFuelType);
		assertEquals("Fuel Type", txtFuelType.getText());
	}

	public void txtPayload() {
		esperarElemento(txtPayload);
		assertEquals("Payload [kg]", txtPayload.getText());
	}

	public void txtTotalWeight() {
		esperarElemento(txtTotalWeight);
		assertEquals("Total Weight [kg]", txtTotalWeight.getText());
	}

	public void txtListPrice() {
		esperarElemento(txtListPrice);
		assertEquals("List Price [$]", txtListPrice.getText());
	}

	public void txtLicensePlateNumbere() {
		esperarElemento(txtLicensePlateNumbere);
		assertEquals("License Plate Number", txtLicensePlateNumbere.getText());
	}

	public void txtAnnualMileage() {
		esperarElemento(txtAnnualMileage);
		assertEquals("Annual Mileage [mi]", txtAnnualMileage.getText());
	}

	public void txtNext01() {
		esperarElemento(txtNext01);
		assertEquals("Next »", txtNext01.getText());
	}

	// Clique
	public void cliqueAbaVeiculo() {
		esperarElemento(qtCamposAbaVeiculo);
		qtCamposAbaVeiculo.click();
	}
	
	public void cliqueRightHandDrive() {
		esperarElemento(cpRightHandDrive);
		cpRightHandDrive.click();
	}
	
	public void cliqueNext01() {
		esperarElemento(qtNext01);
		qtNext01.click();
	}

	// Campos de Seleção
	public void selecionarMarca() {
		esperarElemento(cqMake);
		cqMake.click();
		sltMake.click();
	}

	public void selecionarModelo() {
		esperarElemento(cqModel);
		cqModel.click();
		sltModel.click();
	}

	public void selecionarNumberOfSeats() {
		esperarElemento(cqNumberOfSeats);
		cqNumberOfSeats.click();
		sltNumberOfSeats.click();
	}
	
	public void selecionarNumberSeats() {
		esperarElemento(cqNumberSeats);
		cqNumberSeats.click();
		sltNumberSeats.click();
	}

	public void selecionarFuelType() {
		esperarElemento(cqFuelType);
		cqFuelType.click();
		sltFuelType.click();
	}

	// Campos de Preenchimento
	public void preencheCampoCylinderCapacity(String cylinderCapacity) {
		esperarElemento(cpCylinderCapacity);
		cpCylinderCapacity.sendKeys(cylinderCapacity);
	}

	public void preencheCampoEnginerPerformance(String enginePerformance) {
		esperarElemento(cpEnginePerformance);
		cpEnginePerformance.sendKeys(enginePerformance);
	}

	public void preencheCampoDateOfManufacture(String dateManufacture) {
		esperarElemento(cpDateOfManufacture);
		cpDateOfManufacture.sendKeys(dateManufacture);
	}

	public void preencheCampoPayload(String payload) {
		esperarElemento(cpPayload);
		cpPayload.sendKeys(payload);
	}

	public void preencheCampoTotalWeight(String totalWeight) {
		esperarElemento(cpTotalWeight);
		cpTotalWeight.sendKeys(totalWeight);
	}

	public void preencheCampoListPrice(String listPrice) {
		esperarElemento(cpListPrice);
		cpListPrice.sendKeys(listPrice);
	}

	public void preencheCampoLicensePlateNumber(String licenseNumber) {
		esperarElemento(cpLicensePlateNumber);
		cpLicensePlateNumber.sendKeys(licenseNumber);
	}

	public void preencheCampoAnnualMileage(String annualMileage) {
		esperarElemento(cpAnnualMileage);
		cpAnnualMileage.sendKeys(annualMileage);
	}

}
