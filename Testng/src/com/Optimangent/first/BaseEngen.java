package com.Optimangent.first;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Optimangent.Utlity.Drivervariable;

public class BaseEngen {
	static String curdir;
	private static WebDriver driver;
	
	@Parameters("browser")
	@BeforeSuite
	static public void openBrowser(@Optional("chrome")String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
	       curdir=System.getProperty("user.dir");
		 System.setProperty(Drivervariable.key, Drivervariable.value);
		 init();
		}
	
		
	}
		private static void init(){
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			
		}
	
	
		@AfterSuite
		public static void closebrowser(){
				driver.close();
			}
			
		
		
			public static WebDriver getdriver(){
				return driver;
				
			}
			public static String getcurdir() {
				return curdir;
			}
			
		
	}
	
