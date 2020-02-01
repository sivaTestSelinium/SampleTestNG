package com.Automation.scripts;

import org.testng.annotations.Test;

import com.Automation.base.BaseEngine;

public class Filpkart extends BaseEngine {
	@Test
	public void flipkart(){
		//getCurDir.openbrowser("browser");
		getdriver().get("https://www.flipkart.com");
	}

}
