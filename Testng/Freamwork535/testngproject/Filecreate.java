package com.testngproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Filecreate {
	public static void main(String[]args) throws IOException{
		Properties proprety=new Properties();
		proprety.setProperty("Username", "siva");
		proprety.setProperty("id", "email");   
		FileWriter file=new FileWriter("E:\\Eclipse_Neon\\Testng\\Selinium Files\\OR.properties");
		proprety.store(file, "filecreted");
		file.close();
		
	}
		 
}
  