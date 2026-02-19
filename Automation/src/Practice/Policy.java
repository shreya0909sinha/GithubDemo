package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Policy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@aria-label=\"Select month\"]"));
		Select s = new Select(month);
		s.selectByIndex(6);Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]"));
		Select s1 = new Select(year);
		s1.selectByValue("1983");Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='7']")).click();Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9876543210");Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']"));
		if(error.isDisplayed())
		{
			System.out.println("error msg is displayed");
		}
		driver.quit();
		
	}

}
