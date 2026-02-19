package Grooming_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack20 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/ ");
		WebElement addToCartBtn = driver.findElement(
			    By.xpath("//div[contains(., 'FAIR AND HANDSOME')]//button[contains(text(), 'Add To Cart')]")
			);
			addToCartBtn.click();
	}

}
