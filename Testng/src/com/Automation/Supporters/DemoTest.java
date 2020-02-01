package com.Automation.Supporters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoTest {
	 public static void main(String[]ages) throws IOException{
		 File file=new File("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\Supporters\\test.txt");
	      FileReader fw=new FileReader(file);
	      BufferedReader bw=new BufferedReader(fw);
	      
	     String s= bw.readLine();
	      System.out.println(s);
	      
	   
	    	  
	    	  
	      }

}

	
		
	
