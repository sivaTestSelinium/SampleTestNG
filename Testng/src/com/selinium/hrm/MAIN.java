package com.selinium.hrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Automation.Utilitiies.Drivervariables;
import com.selinium.hrm.utilities.Drivers;

public class MAIN {
	private static WebDriver driver;
	private static String CurDir;
	
@Parameters("browser")
@BeforeMethod
public void openbrowser(@Optional("chrome")String browser){
	if(browser.equalsIgnoreCase("chrome")){
		 CurDir=System.getProperty("user.dir")
;		System.setProperty(Drivers.Key,Drivers.Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		}	
}
@AfterMethod
public void closebrowser(){
driver.close();
	
}
public static   WebDriver getdriver(){
	return driver;
	
}
public static String getCurDir(){
	return CurDir;
	
}
}
