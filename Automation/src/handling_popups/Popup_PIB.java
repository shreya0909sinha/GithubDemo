package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Popup_PIB {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://pib.gov.in/indexd.aspx?reg=3&lang=1");Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//a[text()='Ministry of Finance']")).click();
		a.accept();
		String parentWid = driver.getWindowHandle();
		System.out.println(parentWid);
		Set<String> allWid = driver.getWindowHandles();
		for(String wid:allWid)
		{
			driver.switchTo().window(wid);
			if(!parentWid.equals(wid)) {
				break;
			}
		}
		String tile = driver.getTitle();System.out.println(tile);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
