package com.Automation.objectrepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesTest {
	public static void main(String[]args) throws IOException{
	FileInputStream file=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\objectrepository\\OR.properties")	;
	Properties property=new Properties();
	property.load(file);
String un_id=	property.getProperty("un_id");
String next_id=	property.getProperty("next_id");
String pwd_name=	property.getProperty("pwd_name");
System.out.println("the un_id is:"+un_id);

System.out.println("the next_id is:"+next_id);

System.out.println("the pwd_name is:"+pwd_name);
System.setProperty("webdriver.chrome.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.gmail.com");
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ysiva,");
driver.findElement(By.xpath("//*[@id='identifierNext']"));
driver.findElement(By.xpath("//*[@id='passwordNext12']"));

		}

}
