package siva.automation.freamwork.Suppoters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readdata {
	public static void main(String[]ags) throws IOException{
		File file=new File("E:\\Eclipse_Neon\\Testng\\src\\siva\\automation\\freamwork\\Suppoters\\data.txt");
		FileReader reader=new FileReader(file);
		@SuppressWarnings("resource")
		BufferedReader bwriter=new BufferedReader(reader);
		bwriter.readLine();
		bwriter.readLine();
		while(bwriter.ready()){
		String line=	bwriter.readLine();
		System.out.println(line);
		}
		

}
}