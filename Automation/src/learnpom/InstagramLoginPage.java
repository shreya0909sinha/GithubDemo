package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage {

	@FindBy(name = "username")
	private WebElement usernameField;
	@FindBy(name = "password")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//p[contains(text(),'Sorry')]")
	private WebElement errorMessage;

	public InstagramLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void enterUsername(String username) {
	usernameField.sendKeys(username);
	}


	public void enterPassword(String password) {
	passwordField.sendKeys(password);
	}

	public void clickLogin() {
	loginButton.click();
	}

	public boolean isErrorMessageDisplayed() {
	return errorMessage.isDisplayed();
	}
	}


