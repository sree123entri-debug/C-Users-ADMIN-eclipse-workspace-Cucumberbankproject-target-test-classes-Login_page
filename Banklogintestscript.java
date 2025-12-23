package Step_Defination;

import static org.testng.Assert.assertTrue;

import Login_page.Login_page;
import bank.common.Bank_common;
import io.cucumber.java.en.*;

public class Banklogintestscript extends Bank_common{
	
	Login_page lp=new Login_page(d);
	@Given("If user is on home page")
	public void if_user_is_on_home_page() {
		Bank_common.launchbrowser();
	    d.get("https://demo.cyclos.org/ui/home");
	}
	@When("Click on login link")
	public void click_on_login_link() {
		lp=new Login_page(d);
		lp.clicklogin();
	    	}
	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    lp.enterusername("demo");
	    lp.enterpassword("1234");
	    
	}
	@When("Click on Submit button")
	public void click_on_submit_button() {
	    lp.submit();
	}
	@Then("Check the Logout button")
	public void check_the_logout_button() throws Exception {
	    assertTrue(lp.checklogout());
	    lp.clicklogout();
	
Bank_common.closebrowser();
	}
}
