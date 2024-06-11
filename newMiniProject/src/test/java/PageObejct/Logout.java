package PageObejct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
WebDriver driver;
	
	public Logout(WebDriver d){
		driver =d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="react-burger-menu-btn") WebElement handBurger;
	@FindBy(id="logout_sidebar_link") WebElement logOut;
	
	public void clickHandBurger() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		handBurger.click();
	}
	
	public void clickLogOut() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		logOut.click();
	}

}
