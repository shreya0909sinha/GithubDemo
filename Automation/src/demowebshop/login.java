package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("12345678");Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}

}
