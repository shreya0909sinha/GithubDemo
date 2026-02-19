package Grooming_assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert40 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	        driver.switchTo().frame("iframeResult");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[text()='Try it']")).click();
	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert Message: " + alert.getText());
	        alert.accept();
	        Thread.sleep(2000);
	        driver.quit();
	    }
	}

