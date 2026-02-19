package practice_wb_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingToggleBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Slider']")).click();Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement slide = driver.findElement(By.id("slide"));
		actions.clickAndHold(slide).moveToElement(slide).release().build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
