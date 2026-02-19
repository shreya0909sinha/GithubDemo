package learnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookModule {

	@FindBy(id = "small-searchterms")
	private WebElement searchTextbox;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCart;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlist;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribeButton;
	
	public BookModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchItem(String value) {
		searchTextbox.sendKeys(value);
		}
	public void shoppingCart() {
		shoppingCart.click();
		}
	public void wishlist() {
		wishlist.click();
		}
	public void subscribe() {
		subscribeButton.click();
		}
}

