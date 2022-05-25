package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;  
	}
	
	private @FindBy(id="email") WebElement uname;
	private @FindBy(name="passwd") WebElement pass;
	private @FindBy(id="SubmitLogin") WebElement loginButton;
	
	
	public void loginToCRM(String usernameApp,String passwordApp) throws InterruptedException {
		//Thread.sleep(2000);
		uname.sendKeys(usernameApp);
		//Thread.sleep(2000);
		pass.sendKeys(passwordApp);
		loginButton.click();
		
		
	}

}
