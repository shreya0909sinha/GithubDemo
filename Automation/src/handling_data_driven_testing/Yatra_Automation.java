package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yatra_Automation {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream f = new FileInputStream("./testdata/commondata.properties");
	Properties p = new Properties();
	p.load(f);
	String url = p.getProperty("url2");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.xpath("(//img[@alt=\"cross\"])[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[@title='New Delhi'])[1]")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='input-with-icon-adornment']")).sendKeys("Bangalore");Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Bangalore'])[1]")).click();
	driver.findElement(By.xpath("(//p[@title='Mumbai'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='input-with-icon-adornment']")).sendKeys("Dubai");Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Dubai ']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Departure Date']/../..//div[2]")).click();
	for (int i = 1; i <= 6; i++) {
		driver.findElement(By.xpath("(//button[@aria-label='Next Month'])[2]")).click();
	}
	driver.findElement(By.xpath("(//span[text()='15'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	Thread.sleep(23000);
	//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.urlContains("/air-search-ui/"));
	for (int i = 1; i <= 20; i++) {
		Actions a = new Actions(driver);
		a.scrollByAmount(0, 5000).perform();
	}
	Thread.sleep(1000);
	List<WebElement> allfn = driver.findElements(By.xpath("//div[@class=\"airline-holder clearfix\"]//div[2]//span"));
	int count = allfn.size();
	System.out.println("Total No. of Flights: " + count);
	List<WebElement> allfp = driver.findElements(By.xpath("//p[@class=\"i-b\"]"));
	FileInputStream f1 = new FileInputStream("./testdata/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(f1);
	Sheet sh = wb.getSheet("yatraDetails");
	int index = 1;
	for (int i = 0; i < count; i++) {
		WebElement fl = allfn.get(i);
		String fn = fl.getText();
		if (sh.getRow(i) == null) {
	        sh.createRow(i);
	    }
		sh.getRow(i).createCell(0).setCellValue(fn);
		WebElement fp = allfp.get(i);
		String fp1 = fp.getText();
		sh.getRow(i).createCell(1).setCellValue(fp1);
		System.out.println(index + ". " + fn + " : " + fp1);
		index++;
	}
	FileOutputStream fo = new FileOutputStream("./testdata/testscript.xlsx");
	wb.write(fo);
driver.quit();	
}
}
