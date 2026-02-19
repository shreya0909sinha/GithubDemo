package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsageOfGet {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://instagram.com");
		String title="Instagram";
		String actTitle = driver.getTitle();
		//String source=driver.getPageSource();
		// System.out.println(source);
		System.out.println(actTitle);
		String url = "https://www.instagram.com/";
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		if(actTitle.equals(title) && actUrl.equals(url))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
