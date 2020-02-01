package com.Automation.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadData {

	public static void main(String[] args) throws Exception{
		FileInputStream file=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Excel\\TestData.xlsx");
		Workbook work=WorkbookFactory.create(file);
	     Sheet sheet1=work.getSheet("sheet1");
	     
	     for(int i=0;i<sheet1.getLastRowNum();i++)
	 	{
	 		Row row = sheet1.getRow(i);
	 		
	 		for(int j=0;j<row.getLastCellNum()+1;j++)
	 		{
	 			Cell cell = row.getCell(j);
	 			
	 			if (cell.getCellType()==CellType.NUMERIC){
	 				
	 				double d = cell.getNumericCellValue();
	 					
	 				System.out.println(cell.getNumericCellValue());	
	 				}
	 				else if (cell.getCellType()==CellType.STRING) 
	 				{
	 					String d = cell.getStringCellValue();
	 					System.out.println(cell.getStringCellValue());	
	 					}
	 				else 
	 				{
	 				String s=	cell.getStringCellValue();
	 				System.out.println(s);
	 				}
	 			}
	 	
	 			}
	 	
	    		 
	    	 }
	    	 
	     }
	     
	    	 
	     