package com.Automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AppalicationProperties{
	private String filepath;
	private FileInputStream fip;
	private Properties property;
	
	public AppalicationProperties(String filePath) throws IOException{
		this.filepath = filePath;
		fip = new FileInputStream(filePath);
		 property = new Properties();
		if (property!=null){
			property.load(fip);
		}
		else{
			//exception
		}
	}
public String getpropertyvalue1(String key){
String value=	property.getProperty(key);
return value;
	
}
public String getpropertyvalue(String key,String defaultvalue){
	String value1=property.getProperty(key, defaultvalue);
	if(value1==null){
		
	}
	return value1;
	}

public Set keysSet() {
	Set keys = property.keySet();
	return keys;

}
public Map<String, String> keyValueSet(){
	Map<String, String> map=new LinkedHashMap<String,String>();
	Set s=property.keySet();
	for(Object obj:s){
		String key = (String) obj;
		String value = property.getProperty(key);
		map.put(key, value);
	}
	return map;
	}
public void writeKeyValue(String key,String value) throws FileNotFoundException, IOException {
	property.setProperty(key, value);
	property.store(new FileOutputStream(filepath), "file is saved succesfully");
}

public void writeKeyValue(Object key,Object value) throws FileNotFoundException, IOException {
	property.put(key, value);
	property.store(new FileOutputStream(filepath), "file is saved succesfully");

}
}

