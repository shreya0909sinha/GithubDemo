package demo_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyInstagram {
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();
		String expectedTitle ="Instagram";
		Assert.assertEquals(title, expectedTitle);
		
		driver.quit();

}
	@Test
public void verifyLoginBtn()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.instagram.com");
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	boolean res = loginBtn.isEnabled();
	SoftAssert s=new SoftAssert();
	//System.out.println(res);->false
	//s.assertFalse(res); 
	s.assertTrue(res);
	driver.quit();
	s.assertAll();
}
}