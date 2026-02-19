package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("file:///C:/Users/Admin/Documents/Naukari.html");
		Thread.sleep(2000);
		driver.findElement(By.id("upload_resume")).sendKeys("C:\\Users\\Admin\\Desktop\\resume.txt.txt");
		Thread.sleep(2000);
		driver.quit();
	}

}
