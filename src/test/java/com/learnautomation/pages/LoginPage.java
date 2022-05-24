package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;  
	}
	
	private @FindBy(name="email") WebElement uname;
	private @FindBy(name="password1") WebElement pass;
	private @FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginButton;
	
	
	public void loginToCRM(String usernameApp,String passwordApp) throws InterruptedException {
		Thread.sleep(2000);
		uname.sendKeys(usernameApp);
		Thread.sleep(2000);
		pass.sendKeys(passwordApp);
		loginButton.click();
		
		
	}

}
