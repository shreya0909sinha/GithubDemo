package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByCricbuzz {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cricbuzz.com/");
		WebElement ele = driver.findElement(By.xpath("//div[text()='FOLLOW US ON']"));
		Point location = ele.getLocation();
		System.out.println(location);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo"+location);Thread.sleep(2000);
		driver.quit();
	}

}
