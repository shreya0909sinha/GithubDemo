package grooming;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		String heading = driver.findElement(By.xpath("//h2[text()='Revamp your home in style']")).getText();
		System.out.println(heading);
		System.out.println("...............................");
		List<WebElement> allEle = driver.findElements(By.xpath("//h2[text()='Revamp your home in style']/following::span[contains(@class,'a-size-small')]"));
		for(WebElement ele : allEle)
		{
			String text = ele.getText();
			System.out.println(text);
			if(text.equals("Up to 45% off | Laptops"))
				break;
		}
	}
	

}
