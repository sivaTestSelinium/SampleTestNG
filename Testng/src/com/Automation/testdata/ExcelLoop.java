package com.Automation.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLoop {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
	FileInputStream fip=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\testdata\\data.xlsx");
	Workbook workbook=WorkbookFactory.create(fip, "sivakrishna");
	Sheet sheet1=workbook.getSheet("sheet1");
	for(int i=0;i<=sheet1.getLastRowNum();i++){
		Row row=sheet1.getRow(i);
	
	for(int j=0;j<row.getLastCellNum();j++){
	Cell cell=	row.getCell(j);
	if(cell.getCellType()==CellType.STRING){
		String value=cell.getStringCellValue();
		System.out.println(value);
	}
	else if(cell.getCellType()==CellType.NUMERIC){
		Number num=cell.getNumericCellValue();
		System.out.println(num);
	}
	
	
	
		
	}
		
		
		
		
		
		
		
		
		
		}
	
	}

}
