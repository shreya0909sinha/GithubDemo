package scripts_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/121406/ind-vs-nz-3rd-t20i-new-zealand-tour-of-india-2026");
        List<WebElement> allPlayer = driver.findElements(By.xpath("(//div[text()='India'])[2]/following::div[contains(@class,'scorecard-bat-grid')]/div/a"));
        List<WebElement> runs = driver.findElements(By.xpath("(//div[text()='India'])[2]/following::div[contains(@class,'scorecard-bat-grid')]/div[contains(@class,'text-sm')]"));
	    for (int i = 0; i < runs.size(); i++) {
	    WebElement batsman = allPlayer.get(i);
	    WebElement run = runs.get(i);
	    System.out.println(batsman.getText()+"  "+run.getText());
	}

}}
