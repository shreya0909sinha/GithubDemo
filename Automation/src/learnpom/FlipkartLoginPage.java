package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement emailOrMobileField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;
	@FindBy(xpath = "//span[contains(text(),'Please enter valid')]")
	private WebElement errorMessage;

	public FlipkartLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public void enterEmailOrMobile(String value) {
	emailOrMobileField.sendKeys(value);
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
