package PageObejct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	 public LoginPage(WebDriver d){
		driver=d;
		
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="user-name") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id="login-button") WebElement loginBtn;
	
	
	public void enterUsername(String name) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		username.clear();
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		password.clear();
		password.sendKeys(pass);
	}
	
	
	public void ClickBtn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  loginBtn.click();
	}
}
