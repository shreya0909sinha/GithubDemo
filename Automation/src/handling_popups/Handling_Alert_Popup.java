package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.className("btn-danger")).click();
		Thread.sleep(2000);
		 Alert a = driver.switchTo().alert();
		 String text = a.getText();
		 System.out.println(text);
		 Thread.sleep(2000);
		 a.accept();
		 Thread.sleep(2000);
		 driver.quit();
	}

}
