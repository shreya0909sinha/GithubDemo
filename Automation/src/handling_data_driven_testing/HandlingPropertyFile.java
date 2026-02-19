package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("./testdata/commondata.properties");
		Properties p=new Properties();
		p.load(f);
		String url = p.getProperty("url");
		System.out.println(url);
		String email = p.getProperty("email");System.out.println(email);
		String password = p.getProperty("password");System.out.println(password);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);Thread.sleep(2000);
		driver.quit();
		
	}

}
