package StepDefinition;

import org.openqa.selenium.WebDriver;

import PageObejct.HomePage;
import PageObejct.LastSummaryPage;
import PageObejct.LoginPage;
import PageObejct.Logout;
import PageObejct.cartPageVerification;
import PageObejct.informationPage;


public class Base {
	public WebDriver driver;
	LoginPage lp;
	Logout lop;
	HomePage hp;
	cartPageVerification cp;
	informationPage ip;
	LastSummaryPage sp;
}
