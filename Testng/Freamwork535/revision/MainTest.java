package siva.automation.freamework.revision;

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

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ReportStatusStats;

import siva.automation.freamework.Utilities.Drtiverers;



public class MainTest  {
	private static WebDriver driver;
	String tcname;
	private static String curdir;
	static ExtentReports extentReports;
	@Parameters("browser")
	@BeforeSuite
	public static void openbrowser(@Optional ("chrome") String browser){
		if(browser.equalsIgnoreCase(browser)){
		curdir=System.getProperty("user.dir");
		System.setProperty(Drtiverers.chromekey,Drtiverers.chromevalue);
		driver=new ChromeDriver();
		 init();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			init();
		}
	}	
	
		public static void init(){
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);	
			
	}
		@AfterSuite
		public static WebDriver getdriver(){
			return driver;
		}
		public static String getcurdir(){
			return curdir;
			
		}
		@BeforeMethod
		public void beforemethod(Method m){
		tcname=	m.getName();
		System.out.println("the execute method:"+tcname);
		ExtentReports extentTest = (ExtentReports) extentReports.getStartedReporters();
		
			
		}
		@AfterMethod
		public static void Tcextecute(ITestResult result){
			String tcname=result.getName();
 	  if(result.getStatus()==ITestResult.SUCCESS){
 		 System.out.println("the after tc is:"+tcname);
 		
			
		}
 	  else if(result.getStatus()==result.FAILURE){
 		  System.out.println("the tc is:"+tcname);
 		  
 	  }

		
		}
}	

