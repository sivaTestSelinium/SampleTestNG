package siva.automation.freamework.Lisnors;

import java.io.IOException;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import siva.automation.freamework.Utilities.Screenshort;

public class ExecuteFailedTCS implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		System.out.println("the tc is:"+result.getName());
		try{
			Screenshort.Screenshorts(result);
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		return false;
	}

}
