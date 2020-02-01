package com.Aplication.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ApplicationPropreties {
	private Properties property;
	
	public ApplicationPropreties(String filepath) throws IOException {
	FileInputStream fip=new FileInputStream(filepath);
		
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
	public String getpropertyvalues(String keys)
	{
		String value=property.getProperty(keys);
		return value;
}	
	public String getpropertyvalue(String key,String defaultvalues){
		String value= property.getProperty(key, defaultvalues);
		if(value==null){
			value=defaultvalues;
		}
		return value;
		
		
	}
	public List<String> valueset() {
      Set<Object> keys=property.keySet();
		List<String> value=new ArrayList<String>();
	    for(Object obj: keys){
	    	String key=(String) obj;
	    	String value1=property.getProperty(key);
	    	value.add(value1);
	    }
		
		return value;
	}
	
}	

