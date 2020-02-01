package com.Automation.Utilitiies;

import com.Automation.base.BaseEngine;

public interface Drivervariables {
	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = BaseEngine.getCurDir()+"\\Drivers\\chromedriver.exe";
	
	String  firefoxkey = "webdriver.gecko.driver";
	String firefoxValue = BaseEngine.getCurDir()+"E:\\Firefox Setup 46.0.exe";

}
