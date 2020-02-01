package com.Automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("WebDriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https//:www.facebook.com");
    
	}

}
