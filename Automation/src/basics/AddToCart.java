package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.className("login-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
		driver.findElement(By.id("small-searchterms")).sendKeys("Smartphone");
		driver.findElement(By.className("search-box-button")).click();
		wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/search?q=Smartphone"));
		driver.findElement(By.className("product-box-add-to-cart-button")).click();
		String msg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		System.out.println(msg);
	}

}
