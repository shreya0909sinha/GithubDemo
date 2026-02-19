package methods_of_webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele = allLinks.get(i);
		String text = ele.getText();
		System.out.println(text);
		}
	
		driver.quit();
	}

}
