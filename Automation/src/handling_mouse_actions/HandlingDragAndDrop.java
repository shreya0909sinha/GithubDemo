package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement interactions = driver.findElement(By.linkText("Interactions"));
		Actions a = new Actions(driver);
		a.moveToElement(interactions).perform();Thread.sleep(2000);
		WebElement draganddrop = driver.findElement(By.linkText("Drag and Drop"));
		a.moveToElement(draganddrop).perform();Thread.sleep(2000);
		driver.findElement(By.linkText("Static")).click();Thread.sleep(2000);
		WebElement angular = driver.findElement(By.id("angular"));
		WebElement droparea = driver.findElement(By.id("droparea"));
		a.dragAndDrop(angular, droparea).perform();Thread.sleep(2000);
		WebElement node = driver.findElement(By.id("node"));Thread.sleep(2000);
		a.clickAndHold(node).moveToElement(droparea).release().build().perform();Thread.sleep(2000);
		driver.quit();
	}

}
