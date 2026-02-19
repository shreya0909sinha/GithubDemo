package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Books")
	private WebElement bookLink;
	@FindBy(linkText = "Computers")
	private WebElement computersLink;
	@FindBy(linkText = "Electronics")
	private WebElement electronicsLink;
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apprelLink;
	@FindBy(linkText = "Digital downloads")
	private WebElement digiLink;
	@FindBy(linkText = "Jewelry")
	private WebElement jewelLink;
	@FindBy(linkText = "Gift Cards")
	private WebElement giftcardLink;
	@FindBy(linkText = "Log out")
	private WebElement logOutBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void navigateToBook()
	{
		bookLink.click();
	}
	public void navigateToComputer()
	{
		computersLink.click();
	}
	public void navigateToElectronics()
	{
		electronicsLink.click();
	}
	public void navigateToApprel()
	{
		apprelLink.click();
	}
	public void navigateToDigi()
	{
		digiLink.click();
	}
	public void navigateToJewellery()
	{
		jewelLink.click();
	}
	public void navigateToGiftCard()
	{
		giftcardLink.click();
	}
	public void setLogOut()
	{
		logOutBtn.click();
	}
}
