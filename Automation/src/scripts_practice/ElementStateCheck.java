package scripts_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementStateCheck {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        WebElement radioBtn = driver.findElement(By.id("vfb-7-1"));
        WebElement submitBtn = driver.findElement(By.id("vfb-4"));
        if (radioBtn.isDisplayed()) {
            System.out.println("Radio button is displayed");
        }
        if (radioBtn.isEnabled()) {
            System.out.println("Radio button is enabled");
            radioBtn.click();
        }
        if (radioBtn.isSelected()) {
            System.out.println("Radio button is selected");
        }
        if (submitBtn.isEnabled()) {
            submitBtn.click();
        }

        driver.quit();
    }
}
