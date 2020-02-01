package com.Automation.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
		FileInputStream fip= new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\testdata\\data.xlsx");
	Workbook workbook=WorkbookFactory.create(fip);
	Sheet sheet1=workbook.getSheet("sheet1");
     Row row0 = sheet1.getRow(0);
	
	Cell cell00 = row0.getCell(0);
	String value=cell00.getStringCellValue();
	System.out.println(value);
	
	Cell cell0=row0.getCell(1);
String num=	cell0.getStringCellValue();
	System.out.println(num);
		
	}
	

}
