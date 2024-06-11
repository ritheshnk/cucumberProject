package PageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addBag;
	@FindBy(xpath="(//div[@class='inventory_item_name '])[1]")
	WebElement itemTitle;
	@FindBy(id="shopping_cart_container")
	WebElement cart;
	
	public String getItemTitle() {
		String title=itemTitle.getText();
		System.out.println(title);
		return title;
	}
	public void addBagPack() {
		addBag.click();
	}
	
	public void clickCart() {
		cart.click();
	}
	
}
