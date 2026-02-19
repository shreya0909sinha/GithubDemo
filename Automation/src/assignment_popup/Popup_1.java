package assignment_popup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=checkbox.size();
		Thread.sleep(2000);
		for(WebElement ele:checkbox)
		{
			ele.click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
