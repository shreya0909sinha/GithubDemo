package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement email = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	//getSize()is used to get the size (height & width)of the element
	Dimension d1 = email.getSize();		int h1 = d1.getHeight();		int w1 =d1.getWidth();
	//getLocation() is used to get the location(xaxis & yaxis)of the element.
	 Point p1 = email.getLocation();		int x1=p1.getX();		int y1=p1.getY();
	 Dimension d2 = pass.getSize();		int h2 = d2.getHeight();		int w2 =d2.getWidth();
	 Point p2 = pass.getLocation();		int x2=p2.getX();		int y2=p2.getY();
	 //getRect() is the combination of bothGetSize and getLocation ,we can get loc and size of an ele
	 Rectangle r = email.getRect();
	 System.out.println(x1);
	 System.out.println(x2);
	 System.out.println(h1);
	 System.out.println(h2);
	 System.out.println(w1);
	 System.out.println(w2);
	 if(h1==h2 && w1==w2 && x1==x2) {
		 
			 System.out.println("pass"); 
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	 driver.quit();
	}

}
