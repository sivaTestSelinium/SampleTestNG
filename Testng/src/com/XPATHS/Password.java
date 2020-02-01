package com.XPATHS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	    
	    driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	    String atitle = driver.getTitle();
	    System.out.println("page title:"+atitle);
	    		
	 //verifiying web elemts in the home page
	 boolean logo=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();	 
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
		 System.out.println("invalid user name");
	     }
	 
	 boolean pwd=driver.findElement(By.xpath("//input[@name='txtPassword']")).isDisplayed();	 
	 if(pwd=true){
		 System.out.println("Password text box is dispaly");	 
		 }
	 else{
		 System.out.println("invalid pwd");
	     }
	 boolean btn=driver.findElement(By.xpath("//input[@value='LOGIN']")).isDisplayed();	 
	 if(btn=true){
		 System.out.println("login button is dispaly");	 
		 }
	 else{
		 System.out.println("login button invalid");
	     }
	
	 boolean hrm=driver.findElement(By.xpath("//div[@id='footer']/div")).isDisplayed();	 
	 if(hrm=true){
		 System.out.println("hrm text is dispaly");	 
		 }
	 else{
		 System.out.println("hrm text not dispaly");
	     }
	 boolean socialmedia=driver.findElement(By.xpath("//div[@id='social-icons']")).isDisplayed();	 
	 if(socialmedia=true){
		 System.out.println("socialmedia text is dispaly");	 
		 }
	 else{
		 System.out.println("socialmedia text not dispaly");
	     }
	
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	    System.out.println("password is enter and username empty");
	
    String a=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	System.out.println(a);
    if(a.equals("username cannot be empty"))
	{
		System.out.println("error masg display");
	}
	else{
		System.out.println("error masg  doesnot display");
}
}
}


