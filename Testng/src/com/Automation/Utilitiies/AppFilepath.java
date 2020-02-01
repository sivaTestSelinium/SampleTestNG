package com.Automation.Utilitiies;

import com.Automation.base.BaseEngine;

public interface AppFilepath {
	String confFilePath = BaseEngine.getCurDir() + "\\src\\com\\Automation\\objectrepository\\Config.properties";
	String Or_properties = BaseEngine.getCurDir() + "\\src\\com\\Automation\\objectrepository\\OR.properties";
	String txtfilepath = "";
	String Excelfilepath = BaseEngine.getCurDir() + "src\\com\\Automation\\testdata\\data.xlsx";

}
