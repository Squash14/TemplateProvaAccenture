package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class AbaCotacaoPage extends MetodosUteis {

	protected WebDriver driver;

	public AbaCotacaoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Elementos de texto
	@FindBy(how = How.CSS, using = "#sendemail")
	private WebElement qtSend;

	@FindBy(how = How.CSS, using = "#sendemail")
	private WebElement txtSend;

	@FindBy(how = How.CSS, using = "div.field.idealforms-field.idealforms-field-email > label")
	private WebElement txtEmail;

	@FindBy(how = How.CSS, using = "#sendQuoteForm > div:nth-child(2) > label")
	private WebElement txtPhone;

	@FindBy(how = How.CSS, using = "#sendQuoteForm > div:nth-child(3) > label")
	private WebElement txtUsername;

	@FindBy(how = How.CSS, using = "#sendQuoteForm > div:nth-child(4) > label")
	private WebElement txtPassword;

	@FindBy(how = How.CSS, using = "#sendQuoteForm > div:nth-child(5) > label")
	private WebElement txtConfirmPass;

	@FindBy(how = How.CSS, using = "#sendQuoteForm > div:nth-child(6) > label")
	private WebElement txtComments;

	// Elementos de Campos
	@FindBy(how = How.ID, using = "email")
	private WebElement cpEmail;

	@FindBy(how = How.ID, using = "phone")
	private WebElement cpPhone;

	@FindBy(how = How.ID, using = "username")
	private WebElement cpUsername;

	@FindBy(how = How.ID, using = "password")
	private WebElement cpPassword;

	@FindBy(how = How.ID, using = "confirmpassword")
	private WebElement cpConfirmPass;

	@FindBy(how = How.ID, using = "Comments")
	private WebElement cpComments;

	// Título
	public void txtEmail() {
		esperarElemento(txtEmail);
		assertEquals("E-Mail", txtEmail.getText());
	}

	public void txtPhone() {
		esperarElemento(txtPhone);
		assertEquals("Phone", txtPhone.getText());
	}

	public void txtUsername() {
		esperarElemento(txtUsername);
		assertEquals("Username", txtUsername.getText());
	}

	public void txtPassword() {
		esperarElemento(txtPassword);
		assertEquals("Password", txtPassword.getText());
	}

	public void txtConfirmPass() {
		esperarElemento(txtConfirmPass);
		assertEquals("Confirm Password", txtConfirmPass.getText());
	}

	public void txtComments() {
		esperarElemento(txtComments);
		assertEquals("Comments", txtComments.getText());
	}
	
	public void txtSend() {
		esperarElemento(txtSend);
		assertEquals("« Send »", txtSend.getText());
	}
	
	// Campos de Preenchimento
	public void preencheEmail(String email) {
		esperarElemento(cpEmail);
		cpEmail.sendKeys(email);
	}
	
	public void preenchePhone(String phone) {
		esperarElemento(cpPhone);
		cpPhone.sendKeys(phone);
	}
	
	public void preencheCampoUsername(String username) {
		esperarElemento(cpUsername);
		cpUsername.sendKeys(username);
	}
	
	public void preencheCampoPassword(String password) {
		esperarElemento(cpPassword);
		cpPassword.sendKeys(password);
	}
	
	public void preencheCampoConfirmPass(String confirmPassword) {
		esperarElemento(cpConfirmPass);
		cpConfirmPass.sendKeys(confirmPassword);
	}
	
	public void preencheCampoComments(String comments) {
		esperarElemento(cpComments);
		cpComments.sendKeys(comments);
	}

	// Clique	
	public void cliqueSend() {
		esperarElemento(qtSend);
		qtSend.click();
	}
}
