package PageObejct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPageVerification extends HomePage {
	WebDriver driver ;
	
	public cartPageVerification(WebDriver d){
		super(d);
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	//@FindBy(xpath="//div[@class='inventory_item_name']")
	//WebElement item1;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	////tyy verifying using parent \\\\\
	//@FindBy(xpath="//div[@class='cart_item']")
	WebElement parent;
	
	public void verify() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//div[@class='inventory_item_name']")));
		//String actualText="Sauce Labs Backpack";
		String actuaText1=driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		//String expectedText=item1.getText();
		
		/*if(actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}*/
		WebElement hope1=driver.findElement(By.tagName("body"));
		String oneMore=hope1.getText();
		if(oneMore.contains(actuaText1)) {
			System.out.println("item present");
		}else {
			System.out.println("test failed");
		}
		
		
	}
	
	public void clickCheckout() {
		checkoutBtn.click();
	}
}
