package com.Automation.Utilitiies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.Automation.base.BaseEngine;

public interface ScreenShortutility {
	public static void ScreenShort(ITestResult result) throws IOException{
		TakesScreenshot t=	(TakesScreenshot)BaseEngine.getdriver();
		File file=t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(BaseEngine.getCurDir()+""
				 
				+"\\Screenshot\\"+BaseEngine.gettcname()+".jpeg"));

}
}