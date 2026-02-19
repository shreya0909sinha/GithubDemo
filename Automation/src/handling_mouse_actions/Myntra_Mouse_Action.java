package handling_mouse_actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Myntra_Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));Thread.sleep(2000);
		a.moveToElement(men).perform();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
		List<WebElement> checkbox = driver.findElements(By.xpath("//span[@class='brand-num']/../div"));
		Thread.sleep(2000);
		for(WebElement ele:checkbox)
		{
			ele.click();Thread.sleep(2000);
		}
		WebElement price_slider = driver.findElement(By.xpath("(//span[text()='Price']/../div/div/div/div/div)[1]"));Thread.sleep(2000);
		a.clickAndHold(price_slider).moveByOffset(0, 0).release().build().perform();
		Thread.sleep(2000);
		WebElement price_slider1 = driver.findElement(By.xpath("(//span[text()='Price']/../div/div/div/div/div)[2]"));Thread.sleep(2000);
		a.clickAndHold(price_slider1).moveByOffset(0, 0).release().build().perform();
		Thread.sleep(2000);
		WebElement page = driver.findElement(By.xpath("//li[contains(text(),'Page')]"));
		a.scrollToElement(page).perform();Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@draggable='false'])[last()]")).click();Thread.sleep(2000);
		String parentWid = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		for(String wid:allWid) {
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			if(title.contains("HRX"))
			{
				
				boolean res = driver.findElement(By.className("pdp-add-to-bag")).isEnabled();
				System.out.println(res);
				
			}}
		driver.quit();
	}

}
