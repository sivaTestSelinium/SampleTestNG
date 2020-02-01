package siva.automation.freamework.script;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.mongodb.diagnostics.logging.Logger;

import siva.automation.freamework.Utilities.Applicationpath;
import siva.automation.freamework.revision.MainTest;
import siva.automation.freamwork.Suppoters.Proreuse;
public class GmailTest extends MainTest {

@Test
	public void Gmail() throws FileNotFoundException{
		getdriver().get("https://www.gmail.com");
		Proreuse po =new Proreuse(Applicationpath.config_properties);
     String ur=po.getkeyvalue("url");getdriver().get(ur);
     
		
		
		
		
	}

}
