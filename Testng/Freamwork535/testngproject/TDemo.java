package com.testngproject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TDemo{
	 WebDriver d;  
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse_Neon\\chromedriver.exe");
	  d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	@Test
		public void flipkart()
		{
		d.get("https://www.flipkart.com");	
		System.out.println("flipkart");
		}
	@AfterSuite
	public void close()
	{
		d.quit();
	}
}
