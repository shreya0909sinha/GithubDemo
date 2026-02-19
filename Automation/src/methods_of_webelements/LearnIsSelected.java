package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		boolean res = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(res==false)
		{
			System.out.println("login button is disabled");
		}else {
			System.out.println("login button is enabled");
		}
		driver.navigate().to("https://www.instagram.com");
		boolean res1 = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		driver.quit();
	}

}
