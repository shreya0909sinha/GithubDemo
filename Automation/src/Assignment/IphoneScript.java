package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneScript {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys("iPhone 14 pro max"+Keys.ENTER);
		 Thread.sleep(2000);		
		 List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'Apple iP')]"));
		 Thread.sleep(2000);
		 int count = name.size();
		 System.out.println(count);
		 
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'Apple iP')]/../../div[2]/div[1]/div/div"));
		 Thread.sleep(2000);
		 
		 for(int i=0;i<count;i++)
		 {	
		 System.out.println((i+1)+" "+name.get(i).getText()+"--------->"+price.get(i).getText());
		 }
		 
		 driver.quit();
	}
	}