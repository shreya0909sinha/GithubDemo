package assignment_popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabUsingIterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Thread.sleep(2000);
		String parentWid = driver.getWindowHandle();
		System.out.println(parentWid);
		Set<String> allWid = driver.getWindowHandles();
		System.out.println(allWid);
		Iterator<String> it = allWid.iterator();
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			driver.close();
		}
	}

}
