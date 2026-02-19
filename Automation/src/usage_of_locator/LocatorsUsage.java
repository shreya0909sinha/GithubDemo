package usage_of_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUsage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("file:///C:/Practice/basics/html/demo.html");Thread.sleep(2000);
		WebElement element =driver.findElement(By.tagName("a"));
		element.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		WebElement element1 =driver.findElement(By.id("link2"));Thread.sleep(2000);
		element1.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		WebElement element2 =driver.findElement(By.name("facebook"));Thread.sleep(2000);
		element2.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		WebElement element3 =driver.findElement(By.className("instagram_link"));Thread.sleep(2000);
		element3.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		WebElement element4 =driver.findElement(By.linkText("Facebook"));Thread.sleep(2000);
		element4.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		WebElement element5 =driver.findElement(By.partialLinkText("Insta"));Thread.sleep(2000);
		element5.click();Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		driver.quit();
		
	}

}
