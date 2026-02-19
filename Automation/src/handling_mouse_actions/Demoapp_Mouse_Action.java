package handling_mouse_actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoapp_Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();Thread.sleep(2000);
		driver.findElement(By.linkText("Drag Position")).click();Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		List<WebElement> elements = driver.findElements(By.className("draggable"));
		Actions a = new Actions(driver);
		for(WebElement ele1:elements)
		{if(ele1.getText().contains("Mobile")) {
			a.dragAndDrop(ele1, target1).perform();
		}else {
			a.dragAndDrop(ele1, target2).perform();
		}
		
	}
		driver.quit();

}}
