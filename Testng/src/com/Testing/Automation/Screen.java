package com.Testing.Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screen 
{
	@Test
	public void ScreenDemo() throws IOException
	{
		WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://www.facebook.com");
	
	TakesScreenshot ts=(TakesScreenshot)d;
File file=	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("E:\\gmailhomepage.jpeg"));

	}}