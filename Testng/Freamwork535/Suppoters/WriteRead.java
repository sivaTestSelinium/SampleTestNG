package siva.automation.freamwork.Suppoters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class WriteRead {
	String filename;
	File file;
	FileWriter writer;
	 static BufferedWriter bwrite;
	 FileReader reader;
     BufferedReader areader;
     Map map1;
	
public 	WriteRead(String filename) throws IOException{
	super();
	this.filename=filename;
     file=new File(filename);
     if(file.createNewFile()){
    	 System.out.println("file created");
     }
     else{
    	 System.out.println("exist");	 
    	 
     }
      writer=new FileWriter(file);
       bwrite=new BufferedWriter(writer);
       
     reader=new FileReader(file);
      areader=new BufferedReader(reader);
     
	}
public String getsinglelinedata(String line) throws IOException{
	line=areader.readLine();
	return line;
}
	public List<String> gettotaldata() throws IOException{
		ArrayList<String> l=new ArrayList<String>();
		while(areader.ready()){
		String data=	areader.readLine();
		l.add(data);
			
		}
		return l;
	}
	
	public Map<String,String> getdata() throws IOException{
		 map1=new LinkedHashMap();
			 areader.readLine();
		
		return map1;
		
	}
	public static void  Writerdata(int data) throws IOException{
		
		bwrite.write(data);
		bwrite.flush();
	}
	public static void writedata(String data) throws IOException{
		bwrite.write(data);
		bwrite.flush();
	}
	
	
	
	

}
