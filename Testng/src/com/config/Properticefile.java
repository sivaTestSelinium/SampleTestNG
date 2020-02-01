package com.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properticefile {
	
	static Properties prop;

	public static void getpropertice() throws IOException {
		 prop=new Properties();
		FileInputStream fip=new FileInputStream(("user.dir")+"src\\com\\config\\config.properties");
		prop.load(fip);
	String value=	prop.getProperty("browser");
	System.out.println(value);
			
		}
	public static void setpropertice() throws IOException{
		FileOutputStream out=new FileOutputStream(("user.dir")+"src\\com\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(out, null);
	}
	public static void main(String[] args) {
		
	}
	}
		

	


