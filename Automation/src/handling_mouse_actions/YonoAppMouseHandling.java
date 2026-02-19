package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class YonoAppMouseHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");Thread.sleep(2000);
		driver.findElement(By.className("icon-cancel")).click();Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("12345689");Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("password");Thread.sleep(2000);
		WebElement ele = driver.findElement(By.className("disableddiv"));
		Actions a = new Actions(driver);Thread.sleep(2000);
		a.clickAndHold(ele).perform();Thread.sleep(2000);
		driver.quit();
	}

}
