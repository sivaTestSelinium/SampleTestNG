  package com.Automation.scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Automation.Supporters.AppalicationProperties;
import com.Automation.Supporters.ReuseExcel;
import com.Automation.Utilitiies.AppFilepath;
import com.Automation.base.BaseEngine;

public class Gmail extends BaseEngine{
	
	@Test
	public void gmail() throws IOException{
		//E:\Eclipse_Neon\Testng\src\com\Automation\objectrepository\Config.properties
		System.out.println(BaseEngine.getCurDir() + "\\src\\com\\Automation\\objectrepository\\Config.properties");
		AppalicationProperties property=new AppalicationProperties(AppFilepath.confFilePath);
		String Url = property.getpropertyvalue1("url");
	     getdriver().get(Url);
	     ReuseExcel er=new ReuseExcel("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\testdata\\data.xlsx");
	  String un= er.getsingledata("sheet1", 0, 0);
	  List<String> pwd=er.gettotaldata("sheet1");
	  AppalicationProperties appor=new AppalicationProperties(AppFilepath.Or_properties);
	 
	  String unid=appor.getpropertyvalue1("un_xpath");
	  //System.out.println();
	 String next= appor.getpropertyvalue1("next_xpath");
	 
	
	WebElement ele=  getdriver().findElement(By.xpath(unid));
	ele.sendKeys("siva");
	ele.clear();
	
	WebElement ele1=getdriver().findElement(By.xpath(next));
	ele1.click();
	String sign=appor.getpropertyvalue1("signin_xpath");
                    getdriver().findElement(By.xpath(sign));
	                    
	}

}
