package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	@FindBy(id = "email")
	private WebElement emailTbx;
	@FindBy(id = "pass")
	private WebElement pwdTbx;
	@FindBy(name ="login")
	private WebElement loginBtn;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String email)
	{
		emailTbx.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		pwdTbx.sendKeys(password);
	}
	public void setLogin()
	{
		loginBtn.click();
	}

}
