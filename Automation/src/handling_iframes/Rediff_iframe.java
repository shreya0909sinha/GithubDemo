package handling_iframes;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rediff.com/");Thread.sleep(2000);
		driver.switchTo().frame("moneyiframe");Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='NSE']")).click();Thread.sleep(2000);
		driver.switchTo().parentFrame();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();Thread.sleep(2000);
		String parentid = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		for(String wid:allWid) {
			driver.switchTo().window(wid);
			if(!parentid.equals(wid)){
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
