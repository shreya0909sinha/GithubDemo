package methods_of_webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
		    List<WebElement> headers = row.findElements(By.tagName("th"));
		    for (WebElement h : headers) {
		        System.out.print(h.getText() + "\t");
		    }

		    List<WebElement> cols = row.findElements(By.tagName("td"));
		    for (WebElement c : cols) {
		        System.out.print(c.getText() + "\t");
		    }
		    System.out.println();

	}
		driver.quit();
}
}
