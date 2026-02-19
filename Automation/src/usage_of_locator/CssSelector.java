package usage_of_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/account/login?ret=/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[title='Flipkart']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
