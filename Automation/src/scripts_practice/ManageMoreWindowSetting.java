package scripts_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMoreWindowSetting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://www.fb.com");Thread.sleep(2000);
		driver.manage().window().minimize();Thread.sleep(2000);
		driver.manage().window().fullscreen();Thread.sleep(2000);
		driver.quit();
	}

}
