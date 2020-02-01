package siva.automation.freamwork.Suppoters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Proreuse {
	String filepath;
	FileInputStream fip;
	Properties p;
	
public Proreuse(String filepath) throws FileNotFoundException{
	this.filepath=filepath;
	 fip=new FileInputStream("filepath");
	  p=new Properties();
	 if(p!=null){
		 System.out.println("create afile");
	 }
	 else{
		 //exception
	 }
}
public String getkeyvalue(String key){
	String name=p.getProperty(key);
	
	return name;
	
}
public String getkeyvalue1(String key1,String defaultvalue){
	String value=p.getProperty(defaultvalue,key1);
	if(value==null){
	}
	return value;
	
}
public List<String> getalldata(String key){
	String value=p.getProperty(key);
	List<String> l=new ArrayList<String>();
	l.add(value);

	return l;
	
}

	
	
}