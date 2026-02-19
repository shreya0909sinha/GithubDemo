package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.landrecords.karnataka.gov.in/service2/RTC.aspx");
		Thread.sleep(2000);
		WebElement district = driver.findElement(By.id("ctl00_MainContent_ddlCDistrict"));
		Select s1 = new Select(district);
		s1.selectByIndex(2); Thread.sleep(2000);
		WebElement taluk = driver.findElement(By.id("ctl00_MainContent_ddlCTaluk"));
		Select s2 = new Select(taluk);
		s2.selectByIndex(2); Thread.sleep(2000);
		WebElement hobli = driver.findElement(By.id("ctl00_MainContent_ddlCHobli"));
		Select s3 = new Select(hobli);
		s3.selectByIndex(1); Thread.sleep(2000);
		WebElement village = driver.findElement(By.id("ctl00_MainContent_ddlCVillage"));
		Select s4 = new Select(village);
		s4.selectByIndex(1); Thread.sleep(2000);
		WebElement surnoc = driver.findElement(By.id("ctl00_MainContent_ddlCSurnocNo"));
		Select s5 = new Select(surnoc);
		s5.selectByIndex(0); Thread.sleep(2000);
		WebElement hissa = driver.findElement(By.id("ctl00_MainContent_ddlCHissaNo"));
		Select s6 = new Select(hissa);
		s6.selectByIndex(1); Thread.sleep(2000);
		WebElement period = driver.findElement(By.id("ctl00_MainContent_ddlCPeriod"));
		Select s7 = new Select(period);
		s7.selectByIndex(1); Thread.sleep(2000);
		driver.quit();
	}
}
