package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Admin/Documents/auction.html");
		WebElement players = driver.findElement(By.id("players"));
		Select s=new Select(players);
		s.selectByIndex(0);
		s.deselectByValue("2");
		s.selectByVisibleText("rahul");
		s.selectByContainsVisibleText("path");
		s.deselectByIndex(3);Thread.sleep(2000);
		s.deselectByVisibleText("rahul");Thread.sleep(2000);
		s.deSelectByContainsVisibleText("venkat");Thread.sleep(2000);
		s.deselectByValue("1");Thread.sleep(2000);
		//s.deselectAll();Thread.sleep(2000);
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		List<WebElement> allOption = s.getAllSelectedOptions();
		int count=allOption.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele = allOption.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		List<WebElement> allOptions = s.getOptions();
		for(WebElement ele : allOptions)
		{
			String text = ele.getText();
			System.out.println(text);
		}
		boolean res = s.isMultiple();
		if(res==true)
		{
			System.out.println("it is multi select");
		}else {
			System.out.println("it is single select");
		}
		WebElement ele1 = s.getWrappedElement();
		System.out.println(ele1.getText());
		driver.quit();

	}

}
