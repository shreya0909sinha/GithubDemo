package learnpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement emailTbx;
	private WebElement pwdTbx;
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		emailTbx=driver.findElement(By.id("Email"));
		pwdTbx=driver.findElement(By.id("Password"));
		loginBtn=driver.findElement(By.className("login-button"));
	}
	public void setLogin(String email,String pwd)
	{
		emailTbx.sendKeys(email);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();
	}

}
