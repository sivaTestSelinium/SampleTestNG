package com.Automation.Utilitiies;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.Automation.Supporters.AppalicationProperties;
import com.Automation.Supporters.ReuseExcel;


public class SupportersPojo {
	private static AppalicationProperties appalicationProperties;
	static ReuseExcel excelreader;
	
	public static AppalicationProperties getConfAppObj() throws IOException{
		appalicationProperties =new AppalicationProperties(AppFilepath.confFilePath);
		return appalicationProperties ;	
	}
	
	public static AppalicationProperties getor_propertiesobj() throws IOException{
		appalicationProperties=new AppalicationProperties(AppFilepath.Or_properties);
		
		return appalicationProperties;
	}
	public static ReuseExcel getReuseExcel() throws EncryptedDocumentException, FileNotFoundException, IOException{
		excelreader=new ReuseExcel(AppFilepath.Excelfilepath);
		return excelreader;
		
	}

}
