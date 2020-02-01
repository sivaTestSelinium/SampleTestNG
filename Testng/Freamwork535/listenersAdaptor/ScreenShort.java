
package com.listenersAdaptor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import siva.automation.freamework.revision.MainTest;

public interface ScreenShort {
	public static void Screenshort(String name) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)MainTest.getdriver();
		 File file= ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyDirectory(file, new File("E:\\"+name+".jpeg"));
	}

}
