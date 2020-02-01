package com.Automation.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demoexcel {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\testdata\\data.xlsx");
	Workbook workbook=WorkbookFactory.create(file);
	 Sheet sheet1=workbook.getSheet("sheet1");
	 Row row=sheet1.createRow(0);
	 Cell cell= row.createCell(0);
	 cell.setCellValue("siva");
	 row.createCell(1).setCellValue("facebook");
	 row.createCell(2).setCellValue("cricket");	
	     
	Sheet sheet2= workbook.getSheet("sheet2");
	 Row row1=sheet2.createRow(0);
	Cell cell1=row1.createCell(0);
	cell1.setCellValue("ram");
	FileOutputStream fileOutputStream=new FileOutputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\testdata\\data.xlsx");
	workbook.write(fileOutputStream);
	}

}
