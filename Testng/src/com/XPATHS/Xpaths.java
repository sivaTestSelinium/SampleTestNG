package com.XPATHS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Xpaths {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//input[@id='email']"));
	    driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
	    driver.findElement(By.xpath("//input[starts-with(@id,'u_0_m')]")).sendKeys("siva");
	   WebElement day= driver.findElement(By.id("day"));
	    Select select=new Select(day);
	    select.selectByIndex(20);
	   
	    WebElement month= driver.findElement(By.xpath("//select[@id='month']/option[6]"));
        //Select select1=new Select(month);
        //select1.selectByVisibleText("may");
        month.click();
        
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select select2=new Select(year);
        select2.selectByValue("2019");
        year.click();
		Thread.sleep(1000);
		   
		WebElement radio=driver.findElement(By.xpath("//input[@id='u_0_7']"));
		if( radio.isDisplayed()&& radio.isEnabled()){
			 radio.click();
		}
		else{
			System.out.println("unable to click");
		}
		if(radio.isSelected()){
			System.out.println("redio button select");
		}
		else{
			radio.click();
			System.out.println("second time click");
			driver.quit();
		}
		
		

		
		
		
		
	}

}
