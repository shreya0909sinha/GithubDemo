package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Iframes_Demoapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();Thread.sleep(2000);
		driver.switchTo().frame(0);Thread.sleep(2000);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String pass = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		driver.switchTo().frame(1);Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(email);Thread.sleep(2000);
	}

}
