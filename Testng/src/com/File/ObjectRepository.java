package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class ObjectRepository {
	private Properties property;
	private String filepath;

	private FileOutputStream fop;
	public ObjectRepository(String filepath) throws IOException {
		FileInputStream fip=new FileInputStream(filepath);
		this.filepath= filepath;
		property=new Properties();
		property.load(fip);
	if(property!=null){
		property.load(fip);
	}
	else
	{
		//exception
	}
	
	}
	public String getproperties(String keys) throws IOException{
		FileInputStream fip=new FileInputStream(filepath);
		property=new Properties();
		property.load(fip);
		property.get(keys);
	String value=	property.getProperty(keys);
	return value;
		

	}
	public void setproperties(String keys,String values) throws IOException{
		fop = new FileOutputStream(filepath);
		property.setProperty("ramesh", "123456");
		
		
		 property.store(fop, "file is created");
	}
	public  ArrayList<String> valueset(){
		Set<?> key=property.keySet();
		ArrayList<String> value=new ArrayList<String>();
		for(Object obj : key){
			String key1=(String)obj;
			String value1=property.getProperty(key1);
		value.add(value1);
		}
		
		return value;
	
	}
	
	public Map<String, String> keyvalue(String String){
		Map<String, String> map=new LinkedHashMap<String, String>();
		Set<?> keys =  property.keySet();
		for(Object obj:keys){
		String key=(String)obj;
		String value=property.getProperty(key);
		map.put(key, value);
		
		
	}
	return map;
			
	}
	
	}
	
 
	 


