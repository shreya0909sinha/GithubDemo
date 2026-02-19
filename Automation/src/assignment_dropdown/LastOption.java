package assignment_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Admin/Documents/auction.html");
		 WebElement player = driver.findElement(By.id("players"));
		 Select s = new Select(player);

		// select last option
		int size = s.getOptions().size();
		Thread.sleep(2000);
		System.out.println(size);
		s.selectByIndex(size - 1);
		Thread.sleep(2000);
		driver.quit();
	}

}
