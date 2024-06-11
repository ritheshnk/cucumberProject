package PageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class informationPage {
	WebDriver driver;
	
	public informationPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public void fillFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void fillLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void fillPostalCode(String pcode) {
		postalCode.sendKeys(pcode);
	}
	
	public void clikcBtn() {
		continueBtn.click();
	}
}
