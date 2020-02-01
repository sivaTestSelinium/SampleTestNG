package com.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDemo {
	public static void main(String[]args) throws IOException, InterruptedException{
		FileInputStream fip=new FileInputStream("E:\\Eclipse_Neon\\Testng\\Selinium Files\\OR.properties");	
		Properties property=new Properties();
		property.load(fip);
		String Username=property.getProperty("Username");
		String pwd=property.getProperty("pwd");
		String next=property.getProperty("next");
		System.out.println("username is:"+Username);
		System.out.println("pwd is:"+pwd);
		System.out.println("next is:"+next);
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		d.findElement(By.xpath(Username)).sendKeys("ysiva.13");
		Thread.sleep(1000);   
		d.findElement(By.xpath(pwd)).sendKeys("siva");
		d.findElement(By.xpath(next)).click();
		d.quit();
		
		
		
	}

}
