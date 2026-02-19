package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(res==true) {
			System.out.println("The logo is displayed");
		}
		else
		{
			System.out.println("The logo is not displayed");
		}
		driver.quit();
	}

}
