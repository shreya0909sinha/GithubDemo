package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodUsage {

	public static void main(String[] args) throws InterruptedException {
		Demo d =new Demo();
		WebDriver driver = new ChromeDriver();
		d.execute(driver);
		WebDriver driver1 = new EdgeDriver();
		d.execute(driver1);
	}

}
