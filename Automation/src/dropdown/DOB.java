package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		Thread.sleep(2000);
		s1.selectByIndex(8);
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		Thread.sleep(2000);
		s2.selectByIndex(8);
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1995");
		Thread.sleep(2000);
		driver.quit();
	}

}
