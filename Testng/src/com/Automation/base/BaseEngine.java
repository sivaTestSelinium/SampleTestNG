package com.Automation.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Automation.Utilitiies.Drivervariables;
import com.Listeners.DriverVariables;
public class BaseEngine {
	private static WebDriver driver;
	private static String tcname;
	public static String CurDir;
	@Parameters("browser")
	@BeforeSuite
	public static void openbrowser(@Optional("chrome")String browser){
		if(browser.equalsIgnoreCase("chrome")){
			CurDir =System.getProperty("user.dir");
			System.setProperty(Drivervariables.chromeKey, Drivervariables.chromeValue);
		driver=new ChromeDriver();
		  init();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty(Drivervariables.firefoxkey, Drivervariables.firefoxValue);
			driver=new FirefoxDriver();
			init();
		}
	}
	
	public static void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}

@AfterSuite
	public static void closebrowser(){
		driver.close();
	}

		public static String  gettcname(){
			return tcname;
	}

		public static WebDriver getdriver() {
			return driver;
		}
		
		public static String getCurDir() {
			
			return CurDir;
		}
		
		@BeforeMethod
     public void beforemethod(Method m){
    	 tcname= m.getName();
    	System.out.println("the tcname is:"+tcname);
 
     } 
		@AfterMethod

public void Aftermethod(ITestResult result) throws IOException{
	 tcname=result.getName();
	if(result.getStatus()==ITestResult.FAILURE){
	System.out.println("the after methos is:"+tcname);
	}
	else if(result.getStatus()==ITestResult.SUCCESS){
	System.out.println("the tc name is:"+tcname);

	}
  }
}