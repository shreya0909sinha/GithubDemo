package xpathbyaxis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorAxis {
	  public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/text-box");
	        driver.findElement(By.xpath("//input[@id='userName']/ancestor::form"));
	        driver.quit();
	    }
}
