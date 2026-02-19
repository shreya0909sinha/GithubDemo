package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis =new FileInputStream("./testdata/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String pwd = p.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);Thread.sleep(2000);
		driver.quit();
	}

}
