package AutimationTesting5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet4
{
	public static void main(String[] args) throws IOException
	{
//		How to Fetch multiple data from all the columns and rows from Excel : We need to use for loop
		
		String path = "C:\\Users\\Shubz008\\Downloads\\Excel For Practice.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
//		If we want to check How many numbers of rows and columns are there in the sheet
//		int RowIndex  = Sheet.getLastRowNum();
//		int ColumnIndex = Row.getLastCellNum();
//		System.out.println(ColumnIndex);
//		System.out.println(RowIndex);
		
		for (int i = 1; i<=6; i++)
		{
			XSSFRow Row = Sheet.getRow(i);
			
			for (int j = 1; j<=2 ; j++ )
			{
				XSSFCell Cell = Row.getCell(j);
				String Value = Cell.getStringCellValue();
				System.out.println(Value);
			}
		}
		
		
		
	}

}
