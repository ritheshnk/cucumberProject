package PageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastSummaryPage {
	WebDriver driver;
	
	public LastSummaryPage(WebDriver d) {
			driver=d;
			PageFactory.initElements(d, this);
			
	}
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	public void clickFinish() {
		finishBtn.click();
	}
}
