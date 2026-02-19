package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {


	@FindBy(id = "ap_email")
	private WebElement emailField;
	@FindBy(id = "continue")
	private WebElement continueButton;
	@FindBy(id = "ap_password")
	private WebElement passwordField;
	@FindBy(id = "signInSubmit")
	private WebElement signInButton;
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement errorMessage;

	public AmazonLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public void enterEmailOrMobile(String emailOrMobile) {
	emailField.sendKeys(emailOrMobile);
	}
	
	public void clickContinue() {
	continueButton.click();
	}

	public void enterPassword(String password) {
	passwordField.sendKeys(password);
	}

	public void clickSignIn() {
	signInButton.click();
	}

	public boolean isErrorMessageDisplayed() {
	return errorMessage.isDisplayed();
	}
	}

