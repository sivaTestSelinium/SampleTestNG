package com.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GmailTest {
	@Test
	public GmailTest() {
		
	WebDriver driver=new FirefoxDriver();
	Reporter.log("btrowser lunched");
	driver.manage().window().maximize();
	Reporter.log("maximized");
	driver.get("https//:www.gmail.com/");
	Reporter.log("open gmail page");
		
	}

	
}
