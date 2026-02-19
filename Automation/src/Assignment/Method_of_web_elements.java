package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_of_web_elements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		WebElement error=driver.findElement(By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/v4/y2/r/O287_AcFyg4.png\"]"));
		String bgcolor=error.getCssValue("color");
		System.out.println(bgcolor);
		Thread.sleep(2000);
		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'The email address or mobile number')]"));
		String message=errorMsg.getText();
		System.out.println(message);
		Thread.sleep(2000);
		WebElement forgot_pass = driver.findElement(By.linkText("Forgotten password?"));
		String pass=forgot_pass.getAttribute("href");
		System.out.println(pass);
		Thread.sleep(2000);
		WebElement tooltip = driver.findElement(By.xpath("//a[@title='Kannada']"));
		String toolTipText=tooltip.getText();
		System.out.println(toolTipText);
		Thread.sleep(2000);
		driver.quit();

	}

}
