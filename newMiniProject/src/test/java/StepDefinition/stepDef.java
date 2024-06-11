package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObejct.HomePage;
import PageObejct.LastSummaryPage;
import PageObejct.LoginPage;
import PageObejct.Logout;
import PageObejct.cartPageVerification;
import PageObejct.informationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDef extends Base {
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		lop=new Logout(driver);
		hp=new HomePage(driver);
		cp=new cartPageVerification(driver);
		ip=new informationPage(driver);
		sp=new LastSummaryPage(driver);
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String name, String pass) {
	    lp.enterUsername(name);
	    lp.enterPassword(pass);
	}

	@When("Click on login")
	public void click_on_login() {
	    lp.ClickBtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		 String currentTile=driver.getTitle();
		    
		    if(currentTile.equalsIgnoreCase(expectedTitle)) {
		    	System.out.println("title matched");
		    }else {
		    	System.out.println("titel not matched");
		    }
	}

	@When("User click on handBurger icon")
	public void user_click_on_hand_burger_icon() {
		lop.clickHandBurger();
	}

	@When("Click on logout")
	public void click_on_logout() {
		lop.clickLogOut();
	}

	@And("Close the browser")
	public void close_the_browser() throws Exception {
	    Thread.sleep(2000);
	    driver.close();
	    driver.quit();
	}

	
	//// add to cart \\\\\
	
	@And("User clicks on any items add to cart")
	public void user_clicks_on_any_items_add_to_cart() throws Exception {
	   hp.addBagPack();
	   hp.getItemTitle();
	}

	@And("User clicks on cart")
	public void user_clicks_on_cart() {
		 hp.clickCart();

	}
	
	//////// verify cart items \\\\\\\
	
	@Then("User verify cart items")
	public void user_verify_cart_items() {
	    cp.verify();
		cp.clickCheckout();
	}
	
	///// fill information \\\\\\\
	
	@Then("User enter firstName {string} and lastName {string} and postCode {string}")
	public void user_enter_first_name_and_last_name_and_post_code(String fname, String lname, String pcode) {
	    ip.fillFirstName(fname);
	    ip.fillLastName(lname);
	    ip.fillPostalCode(pcode);
	}
	

	@Then("User click on continue")
	public void user_click_on_continue() {
	    ip.clikcBtn();
	}
	
	//////the emd game \\\\\\
	
	@Then("User click on finish")
	public void user_click_on_finish() {
	   sp.clickFinish();
	}

}
