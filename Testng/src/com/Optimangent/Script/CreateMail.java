package com.Optimangent.Script;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Optimangent.first.BaseEngen;

public class CreateMail extends BaseEngen{
	
	@Test
	     public static void mail() throws InterruptedException{
		getdriver().get("https://qcapp.optculture.com/");
		getdriver().findElement(By.xpath("//*[@id='un']")).sendKeys("sowmya");
		getdriver().findElement(By.xpath("//*[@id='pw']")).sendKeys("sowmya");
		getdriver().findElement(By.xpath("//*[@id='orgid']")).sendKeys("opt2");
		getdriver().findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		
		//getdriver().findElement(By.xpath("//button[@id='j6FQe0-b']")).click();
		
		Actions action=new Actions(getdriver());
		WebElement ele= getdriver().findElement(By.xpath("//*[@type='button']"));
		action.moveToElement(ele).build().perform();
		//ele.click();
		//Thread.sleep(1000);
		
		getdriver().findElement(By.xpath("//*[@id='k93Qu0-a']"));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}