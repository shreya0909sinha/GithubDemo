package Assignment;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCombine {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("virat");
		Thread.sleep(2000);
		pass.clear();
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement submit = driver.findElement(By.name("websubmit"));
		boolean display = submit.isDisplayed();
		boolean enable = submit.isEnabled();
		System.out.println(display);
		System.out.println(enable);
		String tag = submit.getTagName();
		System.out.println(tag);
		String text = submit.getText();
		System.out.println(text);
		String color = submit.getCssValue("background-color");
		System.out.println(color);
		String type = submit.getAttribute("type");
		System.out.println(type);
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("sex"));
		gender.click();
		boolean radio_gender = gender.isSelected();
		System.out.println(radio_gender);
		WebElement female = driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
		WebElement male = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		WebElement custom = driver.findElement(By.xpath("(//input[@id='sex'])[3]"));
		Dimension d1 = female.getSize();		int h1 = d1.getHeight();		int w1 =d1.getWidth();
		 Point p1 = female.getLocation();		int x1=p1.getX();		int y1=p1.getY();
		 Dimension d2 = male.getSize();		int h2 = d2.getHeight();		int w2 =d2.getWidth();
		 Point p2 = male.getLocation();		int x2=p2.getX();		int y2=p2.getY();
		 Dimension d3 = custom.getSize();		int h3 = d3.getHeight();		int w3 =d3.getWidth();
		 Point p3 = custom.getLocation();		int x3=p3.getX();		int y3=p3.getY();
		 if(h1==h2 && h2==h3 && w1==w2 && w2==w3 && y1==y2 && y2==y3) {
			 
			 System.out.println("pass"); 
	 }
	 else
	 {
		 System.out.println("fail");
	 }
		 WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		 Dimension fname_size = fname.getSize();
		 System.out.println(fname_size);
		 WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 Dimension lname_size = lname.getSize();
		 System.out.println(lname_size);
		driver.quit();

	}

}
