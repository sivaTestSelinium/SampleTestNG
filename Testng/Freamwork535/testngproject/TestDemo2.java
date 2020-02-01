package com.testngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDemo2 {
	WebDriver d;
	@BeforeSuite
	public void openbrowser()
	{
d=new FirefoxDriver();
d.manage().window().maximize();
d.manage().deleteAllCookies();
d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@AfterSuite
	public void close()
	{
		d.quit();
	}
	@Test(priority=2,enabled=true)
public void facebook()
{
	d.get("https://www.facebook.com");
WebElement ele=d.findElement(By.xpath("//*[@id='email']"));
ele.sendKeys("sivakrishna");
WebElement ele1=d.findElement(By.xpath("//*[@id='pass']"));

ele1.sendKeys("siva");
}
	@Test(priority=1,enabled=true)
public void gmail()
{
	d.get("https://www.gmail.com");
	System.out.println("gmail");

}}
