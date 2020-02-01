package com.TestFiles;

import java.awt.Desktop.Action;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestText {


	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.get("http://www.fipkart.com");
		
		
	WebElement ele=driver.findElement(By.xpath("//*[text()='Electronics']"));
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();
	ele.getText();
	File file=new File("E:\\Eclipse_Neon\\Testng\\src\\com\\TestFiles\\TestText.txt");
	boolean b=file.createNewFile();
	if(b){
		System.out.println("created");
	}else {
		System.out.println("exist");
	}
	FileWriter file1=new FileWriter(file);
	BufferedWriter fr=new BufferedWriter(file1);
	
	
	
	
	
	
 


	}
	
	}
