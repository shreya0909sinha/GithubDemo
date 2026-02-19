package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		WebElement country_code = driver.findElement(By.id("country_code"));
		Select s1=new Select(country_code);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		WebElement phone_num = driver.findElement(By.id("phone"));
		phone_num.sendKeys("999999999999");
		Thread.sleep(2000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("select3"));
		Select s2=new Select(country);
		s2.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.id("select5"));
		Select s3=new Select(state);
		s3.selectByContainsVisibleText("Karna");
		Thread.sleep(2000);
		//WebElement city = driver.findElement(By.xpath("//option[text()='Select City']/.."));
		//Select s4=new Select(city);
		//s4.selectByValue("4");
		WebElement quantity = driver.findElement(By.id("select7"));
		Select s5=new Select(quantity);
		s5.selectByIndex(4);
		Thread.sleep(2000);
		driver.quit();
	}

}
