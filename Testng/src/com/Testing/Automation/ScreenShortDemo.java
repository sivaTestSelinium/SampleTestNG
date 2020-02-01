package com.Testing.Automation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShortDemo {
	WebDriver d;
	public void screenshore(String name) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)d;	
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\"+name+".jpeg"));
	}
	@Test
	public void login(){
		d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://www.facebook.com");
	d.findElement(By.id("id"));
	}
	@BeforeMethod
	public void beforemethod(Method m){
		System.out.println("the execution:"+m.getName());
	}
	@AfterMethod
	public void aftermathod(ITestResult result) throws IOException{
		if(ITestResult.FAILURE==result.getStatus()){
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
