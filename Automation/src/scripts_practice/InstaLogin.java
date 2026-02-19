package scripts_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open Instagram
        driver.get("https://www.instagram.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Enter username
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("username")));
        username.sendKeys("shreyasinha.20260909@gmail.com");Thread.sleep(2000);

        // Enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Shubhya@12");Thread.sleep(2000);

        // Click Login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();Thread.sleep(2000);

        //Optional wait to observe login result
        wait.until(ExpectedConditions.urlContains("instagram.com"));
        Thread.sleep(25000);
        System.out.println("Login attempt completed");

        driver.quit(); // close if needed

		
	}

}
