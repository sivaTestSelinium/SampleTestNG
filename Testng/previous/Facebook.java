package com.Automation.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[]args) throws IOException{

File file0=new File("E:\\Eclipse_Neon\\Testng\\src\\com\\config\\config.properties");
FileInputStream fi=new FileInputStream(file0);
Properties property=new Properties();
property.load(fi);
String r=property.getProperty("url");
System.out.println("the url is:"+r);
		
File file=new File("E:\\Eclipse_Neon\\Testng\\Selinium Files\\OR.properties");
FileInputStream file1=new FileInputStream(file);
Properties property1=new Properties();
property1.load(file1);

String username=property.getProperty("Username");
String pwd=property.getProperty("pwd");
String next=property.getProperty("next");

File file2=new File("E:\\Eclipse_Neon\\Testng\\src\\com\\Excel\\TestData.xlsx");
FileInputStream file3=new FileInputStream(file2);
Workbook work=WorkbookFactory.create(file3);

String username1=work.getSheet("sheet1").getRow(7).getCell(0).getStringCellValue();
String pwd1=work.getSheet("sheet1").getRow(7).getCell(2).getStringCellValue();

WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
driver.get(r);
driver.findElement(By.xpath(username));
driver.findElement(By.xpath(pwd));
driver.findElement(By.xpath(next));


	}

	}


