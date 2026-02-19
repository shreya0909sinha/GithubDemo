package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();Thread.sleep(2000);
		WebElement rightClick = driver.findElement(By.id("btn_a"));Thread.sleep(2000);
		Actions a = new Actions(driver);Thread.sleep(2000);
		a.contextClick(rightClick).perform();Thread.sleep(2000);
		WebElement no = driver.findElement(By.xpath("//div[text()='No']"));Thread.sleep(2000);
		a.click(no).perform();Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		String color = ele.getCssValue("color");
		String text = ele.getText();
		System.out.println(color);
		System.out.println(text);
		driver.quit();
	}

}
