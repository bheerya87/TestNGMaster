package com.learnautomation.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//Capture screenshot
	//to handle frames,alerts,windows,sync issues,javascripts executers

	public static void captureScreenshot(WebDriver driver) {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("./Screenshots/Login.png"));
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			System.out.println("Unable to capture screenshot :"+e.getMessage());
		}
	}

}
