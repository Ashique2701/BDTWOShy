package com.bdtwo.PageAction;

import org.testng.Assert;

import com.bdtwo.PageLocation.HomePageLocator;
import com.bdtwo.utill.TestBaseTwo;
import com.bdtwo.utill.TestDataTwo;

public class HomePageAction extends TestBaseTwo {
	HomePageLocator homePageLocator = new HomePageLocator();

	public void EnterXPSinSearchfiled() {
		homePageLocator.Searchfiled.sendKeys(TestDataTwo.laptop);
	}

	public void ClickonSearchlink() {
		homePageLocator.Searchlink.click();
	}

	public void Verifysearchresultsdisplay() {
		boolean searchresult = homePageLocator.Verifyresults.isDisplayed();
		Assert.assertTrue(searchresult);
	}

	public void ClickonSinginbutton() {
		homePageLocator.SigninLink.click();
	}

	public void ClickonSigninlink() {
		homePageLocator.Login.click();
	}

}
