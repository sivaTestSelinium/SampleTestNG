package com.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login(){
		DriverUtility.openBrowser("firefox");
		DriverUtility.getdriver().get("https://www.facebook.com");
	WebElement ele=	DriverUtility.getdriver.findElement(By.id("identifier1"));
	ele.clear();
	ele.sendKeys("gmail");
		
		
	}

}
    