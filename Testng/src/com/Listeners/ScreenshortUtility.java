package com.Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenshortUtility {
	public static void Screenshort(String name,WebDriver driver) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File file= ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyDirectory(file, new File("E:\\"+name+".jpeg"));
	}


}
