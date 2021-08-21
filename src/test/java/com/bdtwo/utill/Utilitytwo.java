package com.bdtwo.utill;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilitytwo {

	public static long implicitlyWait_wait = 60;
	public static long pageLoadTimeout_wait = 60;

	public static void takescreenshot(WebDriver driver, String screenshot) {
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user+dir");
		try {
			FileUtils.copyFile(screenshotfile, new File(currentdir + "/ScreenShots/" + screenshot + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
