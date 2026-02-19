package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		email.sendKeys("Rohit Sharma");
		pass.sendKeys("Rohit Sharma");
		Thread.sleep(2000);
		//clear() is used to clear the text present in the textbox
		email.clear();
		pass.clear();
		Thread.sleep(2000);
		email.sendKeys("Virat kohli");
		pass.sendKeys("Virat kohli");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
