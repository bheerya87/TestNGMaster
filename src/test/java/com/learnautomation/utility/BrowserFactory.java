package com.learnautomation.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL) {
		
		if(browserName.equals("Chrome")) {
			driver=WebDriverManager.chromedriver().create();
			
		}
		else if(browserName.equals("firefox")) {
			driver=WebDriverManager.firefoxdriver().create();
			
			
		}
		else if(browserName.equals("edge")) {
			driver=WebDriverManager.edgedriver().create();
			
			
		}
		else if(browserName.equals("safari")) {
			driver=WebDriverManager.safaridriver().create();
			
			
		}
		else if(browserName.equals("opera")) {
			driver=WebDriverManager.operadriver().create();
			
			
		}
		else {
			System.out.println("We dont support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
		
	}

}
