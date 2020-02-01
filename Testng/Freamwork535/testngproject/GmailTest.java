package com.testngproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class GmailTest{
	WebDriver driver;
@Test
public void Gmail_Login() {
	
	driver.get("https://www.gmail.com");
}
}
