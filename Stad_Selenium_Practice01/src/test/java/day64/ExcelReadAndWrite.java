package day64;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReadAndWrite 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
//		To Read the excel or fetch the data from the excel file
		String filePath = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheetName = workBook.getSheet("Sheet1");
		XSSFRow row = sheetName.getRow(1);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
//		OR we are able to use this also without XSSF but need to import org.apache.poi.ss.usermodel from appache poi
		
//		String filePath = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";
//		FileInputStream file = new FileInputStream(filePath);
//		Workbook workBook = WorkbookFactory.create(file);
//		Sheet sheet = workBook.getSheet("sheet1");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String value = cell.getStringCellValue();
//		System.out.println(value);
		
//		We are able to print the results directly
		System.out.println(sheetName.getRow(2).getCell(2));
		
//		For checking the how much row and cells are present 
		System.out.println("Total rows in the sheet : " + sheetName.getLastRowNum() + " Total cells/columns : " + row.getLastCellNum());
		
//		To print all the values we need to use the for loop
		for(int i = 0; i<sheetName.getLastRowNum(); i++)
		{
			for(int j = 0; j<row.getLastCellNum(); j++)
			{
				System.out.print(sheetName.getRow(i).getCell(j));
			}
			System.out.println(" ");
		}
		
	}

}
