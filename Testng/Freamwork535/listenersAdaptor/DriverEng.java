package com.listenersAdaptor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverEng {
	private static WebDriver driver;
	public static void openbrowser(){
		WebDriver driver=new FirefoxDriver();
		driver.close();
	}
	public static   WebDriver getdriver(){
		return driver;
		
	}
	

}
