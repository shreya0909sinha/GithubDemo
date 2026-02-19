package Practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Of_Webdriver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.faceok.com");
		@Nullable
		String current = driver.getCurrentUrl();
		System.out.println(current);
		driver.quit();
	}

}
