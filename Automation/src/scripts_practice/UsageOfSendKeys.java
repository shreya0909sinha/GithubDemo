package scripts_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.fb.com");Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456987");Thread.sleep(2000);
		
		driver.quit();
	}

}
