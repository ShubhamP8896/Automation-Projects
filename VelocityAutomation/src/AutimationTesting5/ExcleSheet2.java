package AutimationTesting5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleSheet2 
{
	public static void main(String[] args) throws IOException                      //Session 46
	{
//		How to Get Multiple data from Sheet without for loop?
		
		String path = "C:\\Users\\Shubz008\\Downloads\\Excel For Practice.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
		XSSFRow Row = Sheet.getRow(1);	
		XSSFCell Cell = Row.getCell(1);
		String Value = Cell.getStringCellValue();		
		System.out.println("UserName "+Value);
		
//		We need to change only Row, cell and value (ref valriables) names
		XSSFRow Row1 = Sheet.getRow(1);	
		XSSFCell Cell1 = Row1.getCell(2);
		String Value1 = Cell1.getStringCellValue();		
		System.out.println("Password "+Value1);
		
		
		
		
		
	}

}
