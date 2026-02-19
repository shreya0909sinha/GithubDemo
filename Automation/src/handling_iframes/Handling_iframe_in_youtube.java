package handling_iframes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_iframe_in_youtube {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();Thread.sleep(2000);
	driver.switchTo().frame("app");Thread.sleep(2000);
	Actions a = new Actions(driver);
	WebElement music = driver.findElement(By.xpath("//span[text()='YouTube Music']"));Thread.sleep(2000);
	a.scrollToElement(music).perform();Thread.sleep(2000);
	a.contextClick(music).perform();Thread.sleep(2000);
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_T);Thread.sleep(2000);
	String parentid = driver.getWindowHandle();System.out.println(parentid);
	Set<String> allWid = driver.getWindowHandles();System.out.println(allWid);
	for(String wid:allWid) {
		driver.switchTo().window(wid);
		if(!parentid.equals(wid)) {
			break;
		}
	}Thread.sleep(2000);
	String current = driver.getWindowHandle();System.out.println(current);Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-controls='suggestion-list']")).sendKeys("duniya"+Keys.ENTER);Thread.sleep(2000);
	driver.quit();
	
}
}
