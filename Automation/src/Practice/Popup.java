package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();Thread.sleep(2000);
		driver.findElement(By.id("fullName")).sendKeys("shreya");Thread.sleep(2000);
		driver.findElement(By.id("emailId")).sendKeys("abc@gmail.com");Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("abcd");Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		WebElement city = driver.findElement(By.id("city"));
		Select s1 = new Select(city);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("resume")).sendKeys("C:\\\\Users\\\\Admin\\\\Desktop\\\\resume.txt.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='HTML']")).click();Thread.sleep(2000);
		driver.findElement(By.id("alert")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();Thread.sleep(2000);
		driver.quit();
		
	}

}
