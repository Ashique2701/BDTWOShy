package StepDefiniTwo;

import com.bdtwo.PageAction.HomePageAction;
import com.bdtwo.PageAction.LoginPageAction;
import com.bdtwo.utill.TestBaseTwo;
import com.bdtwo.utill.Utilitytwo;

import cucumber.api.java.en.Then;

public class SteepDefiniLoginPage extends TestBaseTwo {

	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();

	@Then("^Click on Singinbutton$")
	public void click_on_Singinbutton() throws Throwable {
		homePageAction.ClickonSinginbutton();

	}

	@Then("^Click on Signinlink$")
	public void click_on_Signinlink() throws Throwable {
		homePageAction.ClickonSigninlink();

	}

	@Then("^Enter user name and pass and click signin$")
	public void enter_user_name_and_pass_and_click_signin() throws Throwable {
		loginPageAction.UserCard(prop.getProperty("usernamex"), prop.getProperty("userxpassword"));
	}

	@Then("^Verify Signin$")
	public void verify_Signin() throws Throwable {
		loginPageAction.VerifySignin();
		Utilitytwo.takescreenshot(driver, "User Profile Page");
	}

}
