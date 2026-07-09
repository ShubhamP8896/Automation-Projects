package myPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice 
{
	static String path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\ExcelPractice.xlsx";
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	
	public synchronized String getData(String path, String sheetName, int rowNum, int cellNum) throws IOException
	{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			String Data = cell.toString();
			
			if(workbook!= null)
			{
				workbook.close();
			}
			if(fis!=null)
				
			{
				fis.close();
			}
			
			return Data;	
	}
	
	public synchronized int getLastRowNum(String path, String sheetName) throws IOException
	{
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);

		int lastRowNum = sheet.getLastRowNum();
		
		if(workbook!= null)
		{
			workbook.close();
		}
		if(fis!=null)
			
		{
			fis.close();
		}
		
		return lastRowNum;	
	}
	
	public synchronized int getLastCellNum(String path, String sheetName, int rowNum) throws IOException
	{
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int lastCellNum = row.getLastCellNum();
		
		if(workbook!= null)
		{
			workbook.close();
		}
		if(fis!=null)
			
		{
			fis.close();
		}
		
		return lastCellNum;
	}
	
	public synchronized void setCellData(String path, String sheetName, int rowNum, int cellNum, String Value) throws IOException
	{
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		
		sheet = workbook.getSheet(sheetName);
		if(sheet == null)
		{
			sheet =	workbook.createSheet(sheetName);
		}
		
		row = sheet.getRow(rowNum);
		if(row == null)
		{
			row = sheet.createRow(rowNum);
		}
		
		cell = row.getCell(cellNum);
		if(cell == null)
		{
			cell = row.createCell(cellNum);
		}
		
		cell.setCellValue(Value);
		
		fos = new FileOutputStream(path);
		workbook.write(fos);
		
		if(workbook!=null) workbook.close();
		if(fis!=null) fis.close();
		if(fos!=null)fos.close();
			
	}
	
	public static void main(String[] args) throws IOException 
	{
		ExcelPractice ep = new ExcelPractice();
		String data = ep.getData(path, "Practice", 1, 1);
		
		System.out.println(data);
		
		System.out.println("rows : " + ep.getLastRowNum(path, "Practice"));
		
		System.out.println("cell : " + ep.getLastCellNum(path, "Practice", 0));
		
		ep.setCellData(path, "Practice", 4, 1, "New Entry");
		
	}

}
