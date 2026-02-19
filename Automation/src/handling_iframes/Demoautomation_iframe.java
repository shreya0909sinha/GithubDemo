package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomation_iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement frame1 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		driver.switchTo().frame(frame1);Thread.sleep(2000);
		driver.switchTo().frame(0);Thread.sleep(2000);Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");Thread.sleep(2000);
		
	}

}
