package learnTakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ElementScreenshot {
	@Test
	public void screenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.royalchallengers.com/");
		WebElement rcb = driver.findElement(By.xpath("//img[@src=\"/themes/custom/rcbbase/images/rcb-logo-new.png\"]"));
		File temp = rcb.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/rcb.png");
		FileHandler.copy(temp, dest);
		driver.quit();

	}
}
