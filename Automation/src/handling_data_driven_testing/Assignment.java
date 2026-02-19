package handling_data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// fetch url from property file https://www.saucedemo.com/
// fetch the un and pwd from excel file and print the status in excel file

public class Assignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f = new FileInputStream("./testdata/commondata.properties");
		Properties p = new Properties();
		p.load(f);
		String url1 = p.getProperty("url1");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url1);
		FileInputStream fis = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for (int i = 1; i <= 6; i++) {
			WebElement un = driver.findElement(By.id("user-name"));
			WebElement pwd = driver.findElement(By.id("password"));
			un.clear();
			pwd.clear();
			String un1 = wb.getSheet("assignment").getRow(i).getCell(0).getStringCellValue();
			String pwd1 = wb.getSheet("assignment").getRow(i).getCell(1).getStringCellValue();
			un.sendKeys(un1);
			pwd.sendKeys(pwd1);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(1000);
			String url = driver.getCurrentUrl();
			if (url.contains("inventory")) {
				System.out.println("PASS : Login successful, Inventory page opened");
				wb.getSheet("assignment").getRow(i).createCell(2).setCellValue("Pass");
				driver.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("logout_sidebar_link")).click();
				Thread.sleep(1000);

			} else {
				System.out.println("FAIL : Login unsuccessful");
				wb.getSheet("assignment").getRow(i).createCell(2).setCellValue("Fail");
				driver.get(url1);
				Thread.sleep(1000);
			}

		}
		FileOutputStream fos = new FileOutputStream("./testdata/testscript.xlsx");
		wb.write(fos);
		driver.quit();

	}

}