package com.XPATHS;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class HRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	    
	    driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	    String atitle = driver.getTitle();
	    System.out.println("page title:"+atitle);
	    		
	 //verifiying web elemts in the home page
	 boolean logo=driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();	 
	 if(logo=true){
		 System.out.println("logo is dispaly");	 
		 }
	 else{
		 System.out.println("logo is not displayed");
	     }
	 
	 boolean user=driver.findElement(By.xpath("//input[@name='txtUsername']")).isDisplayed();	 
	 if(user=true){
		 System.out.println("username textbox is dispaly");	 
		 }
	 else{
		 System.out.println("logo is not displayed");
	     }
	 
	 boolean pwd=driver.findElement(By.xpath("//input[@name='txtPassword']")).isDisplayed();	 
	 if(pwd=true){
		 System.out.println("Password text box is dispaly");	 
		 }
	 else{
		 System.out.println("logo is not displayed");
	     }

	 boolean btn=driver.findElement(By.xpath("//input[@value='LOGIN']")).isDisplayed();	 
	 if(btn=true){
		 System.out.println("login button is dispaly");	 
		 }
	 else{
		 System.out.println("logo is not displayed");
	     }
	 
	 
	 //enter the vaild data into ufeilds
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	System.out.println("entered the user name and password then clicked on the login button sucessfully");
    
	//validating the main home page
        if (driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed()) {
        	System.out.println("Main Home page displayed sucessfully");
		}
        else if(driver.findElement(By.xpath("//span[text()='Invalid credentials']")).isDisplayed())
		{
        	System.out.println("Error message displayed");
		}
        	
        driver.close();
         }	
	
}