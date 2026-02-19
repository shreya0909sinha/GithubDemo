package assignment_dropdown;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Admin/Documents/auction.html");
		 WebElement player = driver.findElement(By.id("players"));
		 Select select = new Select(player);
		 List<WebElement> options = select.getOptions();

		 Set<String> unique = new TreeSet<>(); // keeps insertion order

		 for (WebElement option : options) {
		     unique.add(option.getText().trim());
		 }

		 unique.forEach(System.out::println);
		 driver.quit();
	}

}
