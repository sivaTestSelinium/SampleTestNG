package com.reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;

public class Report {
	 static  ExtentReports extent1;
	 
	public static void screen(String filename,WebDriver driver) throws IOException{
	TakesScreenshot s=(TakesScreenshot)driver;
	File file=s.getScreenshotAs(OutputType.FILE);
	FileUtils.copyDirectory(file, new File(filename));
	}
	public static void main(String[]args){
		
		
}
	
}