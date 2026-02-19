package scripts_practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		@Nullable
		String url = driver.getCurrentUrl();
		System.out.println(url);
		@Nullable
		String data = driver.getPageSource();System.out.println(data);
		driver.quit();
	}

}
