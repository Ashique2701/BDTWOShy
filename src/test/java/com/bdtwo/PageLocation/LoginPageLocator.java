package com.bdtwo.PageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bdtwo.utill.TestBaseTwo;

public class LoginPageLocator extends TestBaseTwo {

	public LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='EmailAddress']")
	public WebElement Email;

	@FindBy(how = How.XPATH, using = "//input[@id='Password']")
	public WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@id='sign-in-button']")
	public WebElement SButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Ashequr Rahman']")
	public WebElement VerifyUser;

}
