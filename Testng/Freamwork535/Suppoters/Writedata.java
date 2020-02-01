package siva.automation.freamwork.Suppoters;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;


public class Writedata {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\Eclipse_Neon\\Testng\\src\\siva\\automation\\freamwork\\Suppoters\\data.txt");
		boolean f=file.createNewFile();
		if(f){
			System.out.println("file created");
			
		}else{
			System.out.println("exist");
		}
		FileWriter reader=new FileWriter(file);
		@SuppressWarnings("resource")
		BufferedWriter bwrite=new BufferedWriter(reader);
		
		bwrite.write("welcom");
		bwrite.newLine();
		bwrite.write("siva");
		bwrite.flush();
		
	}

}
