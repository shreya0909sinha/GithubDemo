package Grooming_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTooltip25 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
       
            driver.findElement(By.xpath("//span[text()]/parent::a")).click();
        
        WebElement searchBox = driver.findElement(By.name("q"));
        String tooltip = searchBox.getAttribute("title");
        System.out.println("Search Box Tooltip: " + tooltip);

        driver.quit();
	}

}
