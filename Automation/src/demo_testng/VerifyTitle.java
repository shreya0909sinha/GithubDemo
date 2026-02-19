package demo_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		String expectedTitle ="Googly";
		/*if(title.equals(expectedTitle)) {
			Reporter.log("Pass",true);
		}else {
			Reporter.log("Fail",true);
		}*/
		//Assert.assertEquals(title, expectedTitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, expectedTitle);
		
		driver.quit();
		s.assertAll();
	}

}
