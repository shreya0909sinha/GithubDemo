package Grooming_assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://shoppersstack.com/");
        driver.findElement(By.xpath("(//div[contains(@class,'product-card')])[1]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'compare')]")).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        String flipkartWindow = "";
        String ebayWindow = "";
        for (String window : allWindows) {
            driver.switchTo().window(window);

            if (driver.getTitle().contains("Flipkart")) {
                flipkartWindow = window;
            } else if (driver.getTitle().contains("eBay")) {
                ebayWindow = window;
            }
        }
        driver.switchTo().window(flipkartWindow);
        System.out.println("Currently in: " + driver.getTitle());

        Thread.sleep(2000);
        driver.switchTo().window(ebayWindow);
        System.out.println("Currently in: " + driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
    }
}
	