package scripts_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage_Cookies {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
