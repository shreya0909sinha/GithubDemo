package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtiger_mouse_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");Thread.sleep(2000);
		WebElement company = driver.findElement(By.id("companyDropdown"));
		Actions a = new Actions(driver);
		a.moveToElement(company).perform();Thread.sleep(2000);
	    driver.findElement(By.linkText("Contact Us")).click();Thread.sleep(2000);
	    WebElement number = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]"));Thread.sleep(2000);
	    System.out.println(number.getText());
	    driver.quit();
	
	
		
	}

}
