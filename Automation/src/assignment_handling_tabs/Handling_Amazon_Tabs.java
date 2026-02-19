package assignment_handling_tabs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Amazon_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);Thread.sleep(2000);
		String parentWid = driver.getWindowHandle();Thread.sleep(2000);
		Set<String> allWid = driver.getWindowHandles();Thread.sleep(2000);
		for(String wid:allWid) {
			if(!wid.equals(parentWid)) {
				driver.switchTo().window(wid);
				break;
			}
			}Thread.sleep(2000);
				WebElement element = driver.findElement(By.xpath("//span[contains(text(),'iPhone')])[1]"));Thread.sleep(2000);
				String price = element.getText();
				System.out.println("Price of iphone is: "+ price);
	            driver.quit();
			}

		}
		
		



