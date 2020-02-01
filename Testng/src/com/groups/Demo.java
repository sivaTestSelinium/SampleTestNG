package com.groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
	static WebDriver driver;
	@BeforeSuite
	public static void openbrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		}

	@AfterSuite  
	public static void closebrowser(){
		driver.close();
	}
	@Test(priority=1)
	public void main(){
	driver.get("https://www.gmail.com");
		
	}
	@Test(priority=2)
	public void main1(){
	System.out.println("prasanth");
	}
	@Test(priority=2)
	public void main2(){
	System.out.println("trinadh");

	}

}


