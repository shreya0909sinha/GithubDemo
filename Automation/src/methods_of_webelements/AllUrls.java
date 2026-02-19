package methods_of_webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllUrls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		for(WebElement ele:allLinks)
		{
			String url=ele.getAttribute("href");
			System.out.println(url);
		}
		driver.quit();
	}

}
