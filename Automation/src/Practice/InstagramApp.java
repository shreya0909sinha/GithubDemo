package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InstagramApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile Number or Email\"]")).sendKeys("shreyasinha.20260909@gmail.com");
		
	}

}
