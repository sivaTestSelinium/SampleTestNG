package siva.automation.freamwork.objectRepostory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedata {

	public static void main(String[] args) throws IOException {
		FileInputStream fip=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\siva\\automation\\freamwork\\objectRepostory\\OR.properties");
	Properties pro=new Properties();
	pro.setProperty("username","sivakrishna");
	pro.setProperty("pwd","********");
	pro.store(new FileOutputStream("E:\\Eclipse_Neon\\Testng\\src\\siva\\automation\\freamwork\\objectRepostory\\OR.properties"), null);
	

}
}