package com.selinium.hrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Leaves extends MAIN{
	@Test
	public void leavelist() throws IOException{
		getdriver().get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	    String atitle = getdriver().getTitle();
	    System.out.println("page title:"+atitle);
	    
	    getdriver().findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		getdriver().findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		getdriver().findElement(By.xpath("//input[@value='LOGIN']")).click();
	
    getdriver().findElement(By.linkText("Leave")).click();
    getdriver().findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
    
       String[] array={"Date","Employee Name","Leave Type","Leave Balance (Days)","Number of Days","Status","Comments","Actions"};  
        for (int i = 1; i <= array.length; i++) {
        String s=getdriver().findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+ i +"]/span")).getText();
		if (array[i-1].equals(s)) {
			Reporter.log("pass");
		} else {
			Assert.assertFalse(array[i-1].equals(s),"Header is not matched");
		Reporter.log("fail");
		}
		
		
	/*	String[] array1={"2020-01-31","y siva krishna","Annual Leave","97.00","1.00","Cancelled(1.00)"};  
        for (int k = 1; k <= array.length; k++) {
        String s1=getdriver().findElement(By.xpath("//table[@id='resultTable']//following-sibling::tbody/tr/td/a")).getText();
		if (array[k-1].equals(s1)) {
			Reporter.log("pass");
		} else 
		{
			Assert.assertFalse(array[k-1].equals(s1),"Header is not matched");
		Reporter.log("fail");
		}*/
		
        }
        } 
        
	}
	
	
	/*getdriver().findElement(By.linkText("Time")).click();
		
     String[] array1={"Project Name","Activity Name","center"};
	  for (int i = 0; i <= array1.length; i++) {
		String s1=getdriver().findElement(By.xpath("//div[@class='tableWrapper']/table/thead/tr/th["+ i+ "]")).getText();
		if(array1[i-0].equals(s1)){
			Reporter.log("pass");
		}else{
			Assert.assertFalse(array1[i-0].equals(s1),"Header is not matchedd");
			Reporter.log("fail");
			
		}
	}
		
		getdriver().findElement(By.linkText("Performance")).click();
		getdriver().findElement(By.linkText("Employee Trackers")).click();
		String[] array2={"Employee","Tracker","Added Date","Modified Date"};
		for(int i=1;i<=array2.length;i++){
		String s2=	getdriver().findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+i+"]/span")).getText();
		if(array2[i-1].equals(s2)){
			Reporter.log("pass");
		}else{
			Assert.assertFalse(array2[i-1].equalsIgnoreCase(s2), "headern not matched");
			Reporter.log("fail");
			
			
			
		}
			
		}*/
	
	
