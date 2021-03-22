package stepdefinitions;


import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageobjects.AbaCotacaoPage;
import pageobjects.AbaDadosPage;
import pageobjects.AbaPricePage;
import pageobjects.AbaProtudoPage;
import pageobjects.AbaVeiculoPage;
import pageobjects.MensagemPage;

public class StepsDefinitions {

	WebDriver driver;

	@Dado("^que acesso a aplicação$")
	public void que_acesso_a_aplicacao() throws Throwable {
		Hooks.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
		driver = Hooks.getDriver();
	}

	@Dado("^clico na aba Enter Vehicle Data$")
	public void clicoNaAbaEnterVehicleData() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.cliqueAbaVeiculo();
	}

	@Então("^visualizo a quantidade de campos a serem preenchidos$")
	public void visualizoaquantidadedecamposaserempreenchidos() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.qtCamposAbaVeiculo();
	}

	@Dado("^que visualizo o título do campo Make$")
	public void queVisualizoOTítuloDoCampoMake() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtMake();
	}

	@Dado("^seleciono o veiculo do campo Make$")
	public void selecionoOVeiculoDoCampoMake() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.selecionarMarca();
	}

	@Dado("^visualizo o título Model$")
	public void visualizo_o_título_Model() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtModel();
	}

	@Dado("^seleciono o o modelo Scooter no campo Model$")
	public void seleciono_o_o_modelo_Scooter_no_campo_Model() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.selecionarModelo();
	}

	@Dado("^visualizo o título Cylinder Capacity \\[ccm\\]$")
	public void visualizo_o_título_Cylinder_Capacity_ccm() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtCylindercapacity();
	}

	@Dado("^preencho o campo cylinderCapacity \"([^\"]*)\"$")
	public void preencho_o_campo_cylinderCapacity(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoCylinderCapacity(arg1);
	}
	
	@Dado("^visualizo o título Engine Performance \\[kW\\]$")
	public void visualizoOTítuloEnginePerformanceKW() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtEnginePerformance();
	}

	@Dado("^preencho o campo enginePerformance \"([^\"]*)\"$")
	public void preenchoOCampoEnginePerformance(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoEnginerPerformance(arg1);
	}

	@Dado("^visualizo o título Date of Manufacture$")
	public void visualizoOTítuloDateOfManufacture() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtDateofmanufacture();
	}
	
	@Dado("^preencho o campo dateManufacture \"([^\"]*)\"$")
	public void preenchoOCampoDateManufacture(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoDateOfManufacture(arg1);
	}

	@Dado("^visualizo o título Number of Seats$")
	public void visualizoOTítuloNumberOfSeats() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtNumberOfSeats();
	}

	@Dado("^seleciono o número no campo Number of Seats$")
	public void selecionoONúmeroNoCampoNumberOfSeats() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.selecionarNumberOfSeats();
	}
	
	@Dado("^visualizo o título Right Hand Drive$")
	public void visualizo_o_título_Right_Hand_Drive() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtRightHandDrive();
	}
	
	@Dado("^seleciono o campo Right Hand Drive$")
	public void selecionoOCampoRightHandDriveYes() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.cliqueRightHandDrive();
	}
	
	@Dado("^visualizo o título NumberSeats$")
	public void visualizoOTítuloNumberSeats() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtNumberSeats();
	}

	@Dado("^seleciono o número no campo NumberSeats$")
	public void selecionoONúmeroNoCampoNumberSeats() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.selecionarNumberSeats();
	}
	@Dado("^visualizo o título Fuel Type$")
	public void visualizoOTítuloFuelType() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtFuelType();
	}

	@Dado("^seleciono o combustivel Petrol no campo Fuel Type$")
	public void selecionoOCombustivelPetrolNoCampoFuelType() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.selecionarFuelType();
	}

	@Dado("^visualizo o título List Price \\[\\$\\]$")
	public void visualizoOTítuloListPrice$() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtListPrice();
	}
	
	@Dado("^preencho o campo listPrice \"([^\"]*)\"$")
	public void preenchoOCampoListPrice(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoListPrice(arg1);

	}
	
	@Dado("^visualizo o título Payload \\[kg\\]$")
	public void visualizo_o_título_Payload_kg() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtPayload();
	}
	
	@Dado("^preencho o campo payload \"([^\"]*)\"$")
	public void preenchoOCampoPayload(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoPayload(arg1);
	}

	@Dado("^visualizo o título Total Weight \\[kg\\]$")
	public void visualizo_o_título_Total_Weight_kg() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtTotalWeight();
	}

	@Dado("^preencho o campo totalWeight \"([^\"]*)\"$")
	public void preencho_o_campo_totalWeight(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoTotalWeight(arg1);
	}

	@Dado("^visualizo o título License Plate Number$")
	public void visualizoOTítuloLicensePlateNumber() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtLicensePlateNumbere();
	}

	@Dado("^preencho o campo licenseNumber \"([^\"]*)\"$")
	public void preenchoOCampoLicenseNumber(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoLicensePlateNumber(arg1);
	}

	@Dado("^visualizo o título Annual Mileage \\[mi\\]$")
	public void visualizoOTítuloAnnualMileageMi() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtAnnualMileage();
	}

	@Dado("^preencho o campo annualMileage \"([^\"]*)\"$")
	public void preenchoOCampoAnnualMileage(String arg1) throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.preencheCampoAnnualMileage(arg1);
	}
	
	@Dado("^visualizo o botão Next$")
	public void visualizoobotãoNext() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.txtNext01();
	}

	@Então("^clico no botão Next$")
	public void clicoNoBotãoNext() throws Throwable {
		AbaVeiculoPage abaVeiculo = new AbaVeiculoPage(driver);
		abaVeiculo.cliqueNext01();
		new Thread();
		Thread.sleep(5000);
	}
	
	@Dado("^visualizo o título First Name$")
	public void visualizoOTítuloFirstName() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtFirstName();
	}

	@Dado("^preencho o campo firstName \"([^\"]*)\"$")
	public void preenchoOCampoFirstNameMarcílio(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoFirstName(arg1);
	}

	@Dado("^visualizo o título Last Name$")
	public void visualizoOTítuloLastName() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtLastName();
	}

	@Dado("^preencho o campo lastName \"([^\"]*)\"$")
	public void preenchoOCampoLastNameBorges(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoLastName(arg1);
	}

	@Dado("^visualizo o título Date of Birth$")
	public void visualizoOTítuloDateOfBirth() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtDateOfBirth();
	}

	@Dado("^preencho o campo dateOfBirth \"([^\"]*)\"$")
	public void preenchoOCampoDateOfBirth(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoDateOfBirth(arg1);
	}

	@Dado("^visualizo o título Gender$")
	public void visualizoOTítuloGender() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtGender();
	}

	@Dado("^seleciono o campo gender")
	public void selecionoOCampoGenderMale() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.cliqueGender();
	}

	@Dado("^visualizo o título Street Address$")
	public void visualizoOTítuloStreetAddress() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtStreetAddress();
	}

	@Dado("^preencho o campo streetAddress \"([^\"]*)\"$")
	public void preenchoOCampoStreetAddressQSConjutoLote(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoStreetAddress(arg1);
	}

	@Dado("^visualizo o título Country$")
	public void visualizoOTítuloCountry() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtCountry();
	}

	@Dado("^seleciono o país Brazil no campo Country$")
	public void selecionoOPaísBrazilNoCampoCountry() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.selecionarCountry();
	}

	@Dado("^visualizo o título Zip Code$")
	public void visualizoOTítuloZipCode() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtZipCode();
	}

	@Dado("^preencho o campo zipCode \"([^\"]*)\"$")
	public void preenchoOCampoZipCode(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoZipCode(arg1);
	}

	@Dado("^visualizo o título City$")
	public void visualizoOTítuloCity() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtCity();
	}

	@Dado("^preencho o campo city \"([^\"]*)\"$")
	public void preenchoOCampoCityBrasilia(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoCity(arg1);
	}

	@Dado("^visualizo o título Occupation$")
	public void visualizoOTítuloOccupation() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtOccupation();
	}

	@Dado("^seleciono a ocupação Public Offial no campo Occupation$")
	public void selecionoAOcupaçãoPublicOffialNoCampoOccupation() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.selecionarOccupation();
	}

	@Dado("^visualizo o título Hobbies$")
	public void visualizoOTítuloHobbies() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtHobbies();
	}

	@Dado("^seleciono o campo hobbies$")
	public void selecionoOCampoHobbiesOther() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.cliqueHobbies();
	}

	@Dado("^visualizo o título Website$")
	public void visualizoOTítuloWebsite() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtWebsite();
	}

	@Dado("^preencho o campo website \"([^\"]*)\"$")
	public void preenchoOCampoWebsiteHttpsWwwLinkedinComInMarciliojunio(String arg1) throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.preencheCampoWebsite(arg1);
	}
	
	@Dado("^visualizo o botão NextInsurantData$")
	public void visualizoobotãoNextInsurantData() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.txtNext02();
	}

	@Então("^clico no botão NextInsurantData$")
	public void clicoNoBotãoNextInsurantData() throws Throwable {
		AbaDadosPage AbaDados = new AbaDadosPage(driver);
		AbaDados.cliqueNext02();
		new Thread();
		Thread.sleep(5000);
	}
	
	@Dado("^visualizo o título Start Date$")
	public void visualizoOTítuloStartDate() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtStartDate();
	}

	@Dado("^preencho o campo startDate \"([^\"]*)\"$")
	public void preenchoOCampoStartDate(String arg1) throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.preencheCampoStartDate(arg1);
	}

	@Dado("^visualizo o título Insurance Sum \\[\\$\\]$")
	public void visualizoOTítuloInsuranceSum$() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtInsuranceSum();
	}

	@Dado("^seleciono um valor no Insurance Sum \\[\\$\\]$")
	public void selecionoUmValorNoInsuranceSum$() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.selecionarInsuranceSum();
	}

	@Dado("^visualizo o título Merit Rating$")
	public void visualizoOTítuloMeritRating() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtMeritRating();
	}

	@Dado("^seleciono um Bonus no campo Merit Rating$")
	public void selecionoUmBonusNoCampoMeritRating() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.selecionarMeritRating();
	}

	@Dado("^visualizo o título Damage Insurance$")
	public void visualizoOTítuloDamageInsurance() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtDamageInsurance();
	}

	@Dado("^seleciono um seguro no campo Damage Insurance$")
	public void selecionoUmSeguroNoCampoDamageInsurance() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.selecionarDamageInsurance();
	}

	@Dado("^visualizo o título Optional Products$")
	public void visualizoOTítuloOptionalProducts() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtOptionalProducts();
	}

	@Dado("^seleciono um produto campo Optional Products$")
	public void selecionoUmProdutoCampoOptionalProducts() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.cliqueOptionalProducts();
	}

	@Dado("^visualizo o título Courtesy Car$")
	public void visualizoOTítuloCourtesyCar() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtCourtesyCar();
	}

	@Dado("^seleciono uma cortesia no campo Courtesy Car$")
	public void selecionoUmaCortesiaNoCampoCourtesyCar() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.selecionarCourtesyCar();
	}
	
	@Dado("^visualizo o botão NextProductData$")
	public void visualizoOBotãoNextProductData() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.txtNext03();
	}

	@Dado("^clico no botão NextProductData$")
	public void clicoNoBotãoNextProductData() throws Throwable {
		AbaProtudoPage AbaProdutos = new AbaProtudoPage(driver);
		AbaProdutos.cliqueNext03();
		new Thread();
		Thread.sleep(10000);
	}
	
	@Dado("^visualizo os títulos da Aba Select Product Data$")
	public void visualizoOsTítulosDaAbaSelectProductData() throws Throwable {
		AbaPricePage abaPricePage = new AbaPricePage(driver);
		abaPricePage.txtSelectOption();
	}

	@Dado("^seleciono um plano no campo Select Option$")
	public void selecionoUmPlanoNoCampoSelectOption() throws Throwable {
		AbaPricePage abaPricePage = new AbaPricePage(driver);
		abaPricePage.cliqueSelectOption();
	}
	
	@Dado("^visualizo o botão NextSelectPriceOption$")
	public void visualizoOBotãoNextSelectPriceOption() throws Throwable {
		AbaPricePage abaPricePage = new AbaPricePage(driver);
		abaPricePage.txtNext04();
	}

	@Dado("^clico no botão NextSelectPriceOption$")
	public void clicoNoBotãoNextSelectPriceOption() throws Throwable {
		AbaPricePage abaPricePage = new AbaPricePage(driver);
		abaPricePage.cliqueNext04();
		new Thread();
		Thread.sleep(10000);
	}
	
	@Dado("^visualizo o título E-Mail$")
	public void visualizoOTítuloEMail() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtEmail();
	}

	@Dado("^preencho o campo email \"([^\"]*)\"$")
	public void preenchoOCampoEmail(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preencheEmail(arg1);
	}

	@Dado("^visualizo o título Phone$")
	public void visualizoOTítuloPhone() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtPhone();
	}

	@Dado("^preencho o campo phone \"([^\"]*)\"$")
	public void preenchoOCampoPhone(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preenchePhone(arg1);
	}

	@Dado("^visualizo o título Username$")
	public void visualizoOTítuloUsername() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtUsername();
	}

	@Dado("^preencho o campo username \"([^\"]*)\"$")
	public void preenchoOCampoUsername(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preencheCampoUsername(arg1);
	}

	@Dado("^visualizo o título Password$")
	public void visualizoOTítuloPassword() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtPassword();
	}

	@Dado("^preencho o campo password \"([^\"]*)\"$")
	public void preenchoOCampoPassword(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preencheCampoPassword(arg1);
	}

	@Dado("^visualizo o título Confirm Password$")
	public void visualizoOTítuloConfirmPassword() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtConfirmPass();
	}

	@Dado("^preencho o campo confirmPassword \"([^\"]*)\"$")
	public void preenchoOCampoConfirmPassword(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preencheCampoConfirmPass(arg1);
	}

	@Dado("^visualizo o título Comments$")
	public void visualizoOTítuloComments() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtComments();
	}

	@Dado("^preencho o campo comments \"([^\"]*)\"$")
	public void preenchoOCampoComments(String arg1) throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.preencheCampoComments(arg1);
	}

	@Dado("^visualizo o botão Send$")
	public void visualizoOBotãoSend() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.txtSend();
	}

	@Quando("^clico no botão Send$")
	public void clicoNoBotãoSend() throws Throwable {
		AbaCotacaoPage AbaCota = new AbaCotacaoPage(driver);
		AbaCota.cliqueSend();
		new Thread();
		Thread.sleep(10000);
	}
	
	@Entao("^visualizo a mensagem \"([^\"]*)\"$")
	public void visualizoAMensagem(String arg1) throws Throwable {
		MensagemPage msg = new MensagemPage(Hooks.getDriver());
		msg.visualizaoMsgTxt(arg1);
	}

}
