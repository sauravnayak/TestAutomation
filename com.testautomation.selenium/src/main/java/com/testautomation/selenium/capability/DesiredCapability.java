package com.testautomation.selenium.capability;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapability {

	public static WebDriver wd;
	
	public WebDriver getDriver(){
		//Adding Chvrdomde Capabili tcies tdo Driverc s
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		return wd;
		
	}
}
