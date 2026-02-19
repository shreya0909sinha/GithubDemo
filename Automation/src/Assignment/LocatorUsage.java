package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//WebElement pollelement =driver.findElement(By.name("pollanswers-1"));
		//pollelement.click();Thread.sleep(2000);
		//WebElement login =driver.findElement(By.className("ico-login"));
		//WebElement pollelement =driver.findElement(By.name("pollanswers-1"));
		driver.findElement(By.name("pollanswers-1")).click();Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();Thread.sleep(2000);
		WebElement remember_me =driver.findElement(By.id("RememberMe"));
		remember_me.click();Thread.sleep(2000);
		WebElement forgot_password =driver.findElement(By.linkText("Forgot password?"));
		forgot_password.click();Thread.sleep(2000);
		driver.quit();
	}

}
