package com.bdtwo.PageAction;

import org.testng.Assert;

import com.bdtwo.PageLocation.LoginPageLocator;
import com.bdtwo.utill.TestBaseTwo;

public class LoginPageAction extends TestBaseTwo {
	LoginPageLocator loginPageLocator = new LoginPageLocator();

	public void UserCard(String U, String P) {
		loginPageLocator.Email.sendKeys(U);
		loginPageLocator.Password.sendKeys(P);
		loginPageLocator.SButton.click();

	}

	public void VerifySignin() {
		boolean loginverification = loginPageLocator.VerifyUser.isDisplayed();
		Assert.assertTrue(loginverification);
	}

}
