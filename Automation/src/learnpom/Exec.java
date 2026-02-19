package learnpom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Exec {
	
	@Test
	public void tc_01()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin123@email.com", "12345678");
	}

}
