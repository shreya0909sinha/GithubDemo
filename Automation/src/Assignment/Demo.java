package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Demo {
	public void execute(WebDriver driver) throws InterruptedException {
		driver.get("https://www.myntra.com/");Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com");Thread.sleep(2000);
		driver.navigate().back();Thread.sleep(2000);
		driver.navigate().refresh();Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());Thread.sleep(2000);
		driver.navigate().forward();Thread.sleep(2000);
		driver.manage().window().fullscreen();Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(555, 333));Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(183, 264));Thread.sleep(2000);
		driver.manage().deleteAllCookies();Thread.sleep(2000);
		driver.manage().window().minimize();Thread.sleep(2000);
		driver.quit();
	}
}
