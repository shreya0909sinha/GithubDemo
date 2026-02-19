package scripts_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindowManage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://www.fb.com");Thread.sleep(2000);
		driver.quit();
	}

}
