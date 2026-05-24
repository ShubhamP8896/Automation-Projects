package myPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgramPracrice 
{
	static String path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\ExcelPractice.xlsx";
	static String sheetName = "Pratice";
	
	public static void writeDataIntoExcel(String path, String sheetName, int rowNum, int cellNum, String value) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		if(sheet==null)
			sheet = wb.createSheet(sheetName);
		
		XSSFRow row = sheet.getRow(rowNum);
		if(row==null)
			row = sheet.createRow(rowNum);		
		
		XSSFCell cell = row.getCell(cellNum);
		if(cell==null)
			cell = row.createCell(cellNum);
		
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}
	
	public static String getExcelData(String path, String sheetName, int rowNum, int cellNum) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(cellNum);
	
		String data = cell.toString();
		wb.close();
		fis.close();
		
		return data;
	}
	
	public static int getLastRowNum(String path, String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		int lastRowNum = sheet.getLastRowNum();
		wb.close();
		fis.close();
		
		return lastRowNum;
	}
	
	public static int getLastCNum(String path, String sheetName, int rowNum) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		
		int lastCellNum = row.getLastCellNum();
		
		wb.close();
		fis.close();

		return lastCellNum;
	}
	
	public static void main(String[] args) throws IOException 
	{
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 0, 0, "Sr. No.");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 0, 1, "First name");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 0, 2, "Last Name");

		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 1, 0, "1");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 1, 1, "Shubham");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 1, 2, "Pawar");
		
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 2, 0, "2");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 2, 1, "Pawan");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 2, 2, "Nagar");
		
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 3, 0, "3");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 3, 1, "Ajay");
		ExcelProgramPracrice.writeDataIntoExcel(path, sheetName, 3, 2, "Pawar");	
		
		
		for(int i = 0; i <= ExcelProgramPracrice.getLastRowNum(path, sheetName); i++)
		{
			for(int j = 0; j < ExcelProgramPracrice.getLastCNum(path, sheetName, i); j++)
			{
				String data = ExcelProgramPracrice.getExcelData(path, sheetName, i, j);
				System.out.print(data + " ");
			}
			System.out.println();
		}
		
	}

}
