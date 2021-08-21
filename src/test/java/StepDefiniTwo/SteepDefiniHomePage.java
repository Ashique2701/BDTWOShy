package StepDefiniTwo;

import org.apache.log4j.Logger;

import com.bdtwo.PageAction.HomePageAction;
import com.bdtwo.utill.LogsHelper_Log;
import com.bdtwo.utill.TestBaseTwo;
import com.bdtwo.utill.Utilitytwo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SteepDefiniHomePage extends TestBaseTwo {

	HomePageAction homePageAction = new HomePageAction();
	Logger logg = LogsHelper_Log.getLogs(LogsHelper_Log.class);

	@Given("^Open application \"([^\"]*)\"$")
	public void open_application(String URL) throws Throwable {
		// initialize();

		launchApplication(URL);
		Utilitytwo.takescreenshot(driver, "Home Page");
		logg.info("Openning URL");
	}

	@Then("^Enter XPS in Searchfiled$")
	public void enter_XPS_in_Searchfiled() throws Throwable {
		homePageAction.EnterXPSinSearchfiled();
		logg.info("Entering product");
	}

	@Then("^Click on Searchlink$")
	public void click_on_Searchlink() throws Throwable {
		homePageAction.ClickonSearchlink();
		logg.info("Clicking search link");
	}

	@Then("^Verify search results display$")
	public void verify_search_results_display() throws Throwable {

		homePageAction.Verifysearchresultsdisplay();
		Utilitytwo.takescreenshot(driver, "Search Result Page");
		logg.info("Verify result display");
	}

}
