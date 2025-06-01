package AutimationTesting5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcleSheet1 
{
	public static void main(String[] args) throws IOException                 // Session - 46
	{
		
//		Path of excel file 
		String path = "C:\\Users\\Shubz008\\Downloads\\New Microsoft Excel Worksheet.xlsx";
		
//		Reading the Excel file
		FileInputStream File = new FileInputStream(path);
		
//		Reading the Workbook   (Apache - POI)
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
//		Reading the SHeet 
		XSSFSheet Sheet = Workbook.getSheet("Sheet2");		
		
//		Reading the Row -----------------
		XSSFRow Row = Sheet.getRow(17);
			
//		Reading the Cell -----------------
		XSSFCell Cell = Row.getCell(1);		
		
//      For String values we are able to use this
		String Value = Cell.getStringCellValue();
		System.out.println("My Country Name is "+Value);
	
		
//		For Numeric values we are able to use this method, It's returns double so we use double
	
		XSSFRow Row1 = Sheet.getRow(17);
		
//		Reading the Cell -----------------
		XSSFCell Cell1 = Row1.getCell(0);		
	
		double Value1 = Cell1.getNumericCellValue();
		System.out.println(Value1);
		
//		Explicit casting for converting higher data type (Double) into lower data type (Int)
		double a = Value1;
		int b = (int) Value1;	
		
//		OR
		
//		double a = value1;
//		int b;
//		b = (int)a;
				
		System.out.println(b);
				
		
	}

}
