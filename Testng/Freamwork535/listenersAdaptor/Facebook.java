package com.listenersAdaptor;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test
	public void login(){
		DriverEng.openbrowser();
		DriverEng.getdriver().get("http//:www.facebook.com");
		DriverEng.getdriver().findElement(By.id("idernf")).sendKeys("siva");
		
		
		
	}

}
