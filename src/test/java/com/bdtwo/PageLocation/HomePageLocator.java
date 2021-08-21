package com.bdtwo.PageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bdtwo.utill.TestBaseTwo;

public class HomePageLocator extends TestBaseTwo {
	public HomePageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@class='mh-search-input']")
	public WebElement Searchfiled;

	@FindBy(how = How.XPATH, using = "//span[@class='mh-search-button-label']")
	public WebElement Searchlink;

	@FindBy(how = How.XPATH, using = "//h2[@class='direct-content__title']")
	public WebElement Verifyresults;

	@FindBy(how = How.XPATH, using = "//span[text()='Sign In']")
	public WebElement SigninLink;

	@FindBy(how = How.LINK_TEXT, using = "Sign In")
	public WebElement Login;
}
