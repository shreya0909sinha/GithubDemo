package practice_wb_method;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Webdriver_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		String url = driver.getCurrentUrl();System.out.println(url);
		String title = driver.getTitle();System.out.println(title);
		driver.navigate().to("https://www.intagram.com");Thread.sleep(2000);
		String url1 = driver.getCurrentUrl();System.out.println(url1);
		String title1 = driver.getTitle();System.out.println(title1);
		driver.navigate().back();Thread.sleep(2000);
		driver.navigate().forward();Thread.sleep(2000);
		driver.navigate().refresh();Thread.sleep(2000);
		driver.quit();
	}

}
