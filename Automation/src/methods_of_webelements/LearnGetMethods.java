package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		//getTagName() is used to get tagname of the element
		String tagName=loginBtn.getTagName();
		System.out.println(tagName);
		//getText() is used to get the tagtext of the given element
		//if the text is not present it will return empty space
		String text=loginBtn.getText();
		System.out.println(text);
		//getAttribute(String attValue)is used to get the attribute value of the given element
		//if there is no attribute matching it will return null
		String attValue=loginBtn.getAttribute("class");
		System.out.println(attValue);
		//getCssValue(String property) is used to get the css value of the element(color,size)
		String bgcolor=loginBtn.getCssValue("background-color");
		System.out.println(tagName);
		driver.quit();
	}

}
