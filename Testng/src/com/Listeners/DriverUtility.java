package com.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {
private static WebDriver driver;
public  static  WebDriver getdriver;

	public static  void openBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome")){
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		}
		}
		public static  WebDriver getdriver(){
			return driver;
		
			
	
		}
		
	}


