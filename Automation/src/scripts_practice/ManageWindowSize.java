package scripts_practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://www.fb.com");Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1024, 768));Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 50));Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.manage().window().fullscreen();Thread.sleep(2000);
		driver.quit();
	}

}
