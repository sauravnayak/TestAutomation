package com.testautomation.selenium.screen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.lang.*;

import com.google.common.annotations.VisibleForTesting;
import com.testautomation.selenium.capability.DesiredCapability;
public class LoginScreen {
	
	// Global Variable's List
	// driver
	private WebDriver driver;
	// URL
	private static String PAGE_URL = "http://the-internet.herokuapp.com/";
	public LoginScreen(WebDriver driver) {
		// This Will initialize
		this.driver = driver;
		driver.get(PAGE_URL);
		// Initialize Elements
		PageFactory.initElements(driver, this);
	}
	 @FindBy(how = How.ID, using = "email")
	   private WebElement edtEmail;
	 @FindBy(how = How.ID, using = "pass")
	   private WebElement edtPassword;
	 @FindBy(how = How.ID, using = "loginbutton")
	   private WebElement btnLogin;
	
	

	
    
    
    public void login(String uname,String pwd ) {
    	
    edtEmail.clear();
    edtEmail.sendKeys(uname);
    edtPassword.clear();
    edtPassword.sendKeys(pwd);
    btnLogin.click();
	}
        
}
