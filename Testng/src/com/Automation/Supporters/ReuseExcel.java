package com.Automation.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReuseExcel {
	private String Excelfilepath;
	private  Workbook work;
	private Sheet sheet;
	private Row row;
	 private Cell cell;
	
	public  ReuseExcel(String Excelfilepath) throws EncryptedDocumentException, FileNotFoundException, IOException{
		this.Excelfilepath = Excelfilepath;
	 work=WorkbookFactory.create(new FileInputStream(Excelfilepath));
	 if(work!=null){
		 System.out.println("file created");
		 
	 }else{
		 System.out.println("file exit");
	 }

	}
	public Sheet getsheet(String sheetname){
	 sheet=	work.getSheet(sheetname);
	 if(sheet!=null){
		 System.out.println("sheet created");
	 }else{
		 System.out.println("sheet is not created");
		 
	 }
		return sheet;
		
	}

public Sheet getsheetindex(int  sheetindex){
	sheet =work.getSheetAt(sheetindex);
	if(sheet!=null){
		System.out.println("created");
	}
	return sheet;
}
public Row getrow(String sheetname,int rownum){
	sheet=getsheet(sheetname);
	 row=sheet.getRow(rownum);
	
	return row;
	
}
public Cell getcell(String sheetname,int rownum,int cellnum){
	sheet=getsheet(sheetname);
	row=sheet.getRow(rownum);
	cell=row.getCell(cellnum);
	return cell;
	
}
public String getsingledata(String sheetname,int rownum,int cellnum){
	String value="";
	cell=getcell(sheetname, rownum, cellnum);
	if(cell.getCellType()==CellType.STRING){
		value=cell.getStringCellValue();
		System.out.println("print string value"+value);
		
		
	}else if(cell.getCellType()==CellType.NUMERIC){
			value=cell.getNumericCellValue()+"";
			System.out.println("print numaric value"+value);
		}
	return value;
}


public List<String> gettotaldata(String sheetname){
	List<String> list=new ArrayList<String>();
	sheet=getsheet(sheetname);
	for(int i=0;i<sheet.getLastRowNum();i++)
	{
		
		Row row=sheet.getRow(i);
		
		for(int j=0;j<=row.getLastCellNum();j++)
		{
			Cell cell=row.getCell(j);
			
			if(cell.getCellType()==CellType.STRING){;
			System.out.println(cell.getStringCellValue());
          list.add(cell.getStringCellValue());
          }
		else if (cell.getCellType()==CellType.NUMERIC) {
			System.out.println(cell.getNumericCellValue());
			list.add(cell.getNumericCellValue()+"");
		}	
		}
		}
	return list;


		}

}
