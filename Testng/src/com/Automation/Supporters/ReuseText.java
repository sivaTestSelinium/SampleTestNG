package com.Automation.Supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReuseText {
	static String filepath;
	static File file;
	private static FileReader fr;
	 private static BufferedReader br;
	 private FileWriter fw;
	private static	BufferedWriter bw;
	public ReuseText(String filepath) throws IOException
	{
	     this. filepath = filepath;
		File file=new File(filepath);
		boolean b=file.createNewFile();
		if(b){
			System.out.println("filecreated");
		}
			else{
				System.out.println("exit");
			}
	 	 fw=new FileWriter(file);
		 bw=new BufferedWriter(fw);
		
		fr=new FileReader(file);
		 br=new BufferedReader(fr);
	
	}
	public String singledata() throws IOException{
		return br.readLine();
	}
	public void totaldata() throws IOException{
		List<String> a=new ArrayList<String>();
	while(br.ready()){
		String data1=br.readLine();
a.add(data1);
	}
	}
public  static void writedata(int data) throws IOException {
	bw.write(data);
	bw.flush();
}
	public static void writedata(String data2) throws IOException{
		bw.write(data2);
		bw.flush();
	}
	
	}
	


