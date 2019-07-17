package com.testautomation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.testautomation.selenium.capability.DesiredCapability;
import com.testautomation.selenium.screen.LoginScreen;

public class LoginTest {
	DesiredCapability d=new DesiredCapability();
	WebDriver driver= d.getDriver();
	LoginScreen objLogin= PageFactory.initElements(driver, LoginScreen.class);
	
	//test
	//testpass
	
	@org.junit.Test()
	public void Logintest() {
		// Auto-generated method stub
		objLogin.login("","");
		//driver.quit();
	}
	
}
