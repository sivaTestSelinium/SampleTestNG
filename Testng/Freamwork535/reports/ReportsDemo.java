package siva.automation.reports;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.collections4.Get;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;



public class ReportsDemo {
	ExtentReports ex;
	
	
	@BeforeMethod
	public void method(Method m){
		System.out.println("method execute");
		
	}
@Test
public void title(){
	
	 ex=new ExtentReports();
	
}


	public static void screenshort(String name,WebDriver driver) throws IOException{
		
		
		TakesScreenshot ts=	(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyDirectory(file, new File(name));
	
	}



}
