package com.Automation.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {
	public static void main(String[]agrs) throws EncryptedDocumentException, IOException{
		
	FileInputStream file=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Excel\\TestData.xlsx");
	Workbook work=WorkbookFactory.create(file);
     Sheet sheet1=work.getSheet("sheet1");
     Row R = sheet1.getRow(0);
		Cell C = R.getCell(0);
Number cell=C.getNumericCellValue();
    System.out.println("cello value is:"+cell);
    
    
     Row r1=sheet1.getRow(6);
     Cell c1=r1.getCell(0);
     Number cc=c1.getNumericCellValue();
     System.out.println("the string is:"+cc);
     
      
     Cell c=R.getCell(1);
     String s= c.getStringCellValue();
  
  System.out.println("the vau is:"+s);
   
     Cell c2=r1.getCell(1);
     String s1=c2.getStringCellValue();
     System.out.println("the valu is:"+s1);
  
	
	}

}
