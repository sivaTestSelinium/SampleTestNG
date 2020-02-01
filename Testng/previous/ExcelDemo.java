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

public class ExcelDemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Excel\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet1 = workbook.getSheet("Sheet1");
		Row R = sheet1.createRow(0);
		Cell C = R.createCell(0);
		C.setCellValue(1234);
		R.createCell(1).setCellValue("pratice");
		Row r1 = sheet1.createRow(1);
		Cell C1 = r1.createCell(0);
		C1.setCellValue(2);
		r1.createCell(1).setCellValue("abc");

		FileOutputStream fileoutputstream = new FileOutputStream("E:\\Eclipse_Neon\\Testng\\src\\com\\Excel\\TestData.xlsx");
		workbook.write(fileoutputstream);
		
		// fileoutputstream.flush();

	}

	/*private static void workbookWrite(FileOutputStream fileoutputstream) {
		// TODO Auto-generated method stub
		System.out.println(" The workbook action is done !");
	}*/

}
