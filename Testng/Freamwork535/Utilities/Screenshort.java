package siva.automation.freamework.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import siva.automation.freamework.revision.MainTest;

public interface Screenshort {
	@Test
	public static void Screenshorts(ITestResult result) throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot)MainTest.getdriver();
		
	File file=	ts.getScreenshotAs(OutputType.FILE);
	
	
	FileUtils.copyDirectory(file,new File("E:\\Eclipse_Neon\\Testng\\Screenshort.jpj"));
	System.out.println("the screenshort is:"+result.getThrowable());


}
}