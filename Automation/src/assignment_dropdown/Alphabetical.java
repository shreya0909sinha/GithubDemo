package assignment_dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabetical {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Admin/Documents/auction.html");
		 WebElement player = driver.findElement(By.id("players"));
		 Select select = new Select(player);

		 // Get all options
		 List<WebElement> options = select.getOptions();

		 // Extract text
		 List<String> optionTexts = new ArrayList<>();
		 for (WebElement option : options) {
		     optionTexts.add(option.getText().trim());
		 }

		 // Sort alphabetically
		 Collections.sort(optionTexts);

		 // Print
		 for (String text : optionTexts) {
		     System.out.println(text);
		 }
	}

}
