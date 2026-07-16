package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	public static FileInputStream fis;
	public static FileOutputStream fos;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static XSSFCellStyle style;
    
  /// To get the Row Count : Need to pass File path and Sheet name
    public synchronized static int getLastRowCount(String filePath, String sheetName)
    {
    	try
    	{
    	fis =  new FileInputStream(filePath);
    	workbook = new XSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetName);
    	int lastRowNum = sheet.getLastRowNum();
    	
    	if(workbook != null) workbook.close();
    	if(fis != null)	fis.close();
    	
    	return lastRowNum;
    	}
    	catch(IOException e)
    	{
    		throw new ExceptionUtility("Row is not Found");
    	} 	
    }
    
  /// To get the Cell Count : Need to pass in the argument file path, sheet name, and row Number for that specific cell count we want.
    public static synchronized int getLastCellNum(String filePath, String sheetName, int rowNum)
    {
    	try
    	{
    		fis = new FileInputStream(filePath);
    		workbook = new XSSFWorkbook(fis);
    		sheet = workbook.getSheet(sheetName);
    		row = sheet.getRow(rowNum);
    		int lastCellNum = row.getLastCellNum();
    		
    		if(workbook != null) workbook.close();
    		if(fis != null) fis.close();
    		
    		return lastCellNum;
    	}
    	catch(IOException e)
    	{
    		throw new ExceptionUtility("Cell is not Found");
    	}
    }
    
  /// To get the specific cell data  : Method is static so we are able to call this with the class name 
    public static synchronized String getCellData(String filePath, String sheetName, int rowNum, int cellNum)
    {
    	try
    	{
    		fis = new FileInputStream(filePath);
    		workbook = new XSSFWorkbook(fis);
    		sheet = workbook.getSheet(sheetName);
    		row = sheet.getRow(rowNum);
    		cell = row.getCell(cellNum);
    		String data = cell.toString();
    		
    		if(workbook != null) workbook.close();
    		if(fis != null) fis.close();
    		
    		return data;
    	}
    	catch(IOException e)
    	{
    		throw new ExceptionUtility("Data is not found in the given cell");
    	}
    }
    
    public static synchronized void setDataIntoCell(String filePath, String sheetName, int rowNum, int cellNum, String setData)
    {
    	try
    	{
    		fis = new FileInputStream(filePath);
    		workbook = new XSSFWorkbook(fis);
    		sheet = workbook.getSheet(sheetName);
    		if(sheet == null) sheet =workbook.createSheet(sheetName);
    		row = sheet.getRow(rowNum);
    		if(row == null) row = sheet.createRow(rowNum);
    		cell = row.getCell(cellNum);
    		if(cell == null) cell = row.createCell(cellNum);
    		
    		cell.setCellValue(setData);
    		fos = new FileOutputStream(filePath);
    		workbook.write(fos);
    		
    		if(workbook != null) workbook.close();
    		if(fis != null) fis.close();
    		if(fos != null) fos.close();
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static synchronized void fillGreenColor(String filePath, String sheetName, int rowNum, int cellNum)
    {
    	try
    	{
    		fis = new FileInputStream(filePath);
    		workbook = new XSSFWorkbook(fis);
    		sheet = workbook.getSheet(sheetName);
    		row = sheet.getRow(rowNum);
    		
    		style = workbook.createCellStyle();
    		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    		
    		cell = row.getCell(cellNum);
    		cell.setCellStyle(style);
    		 fos = new FileOutputStream(filePath);
             workbook.write(fos);

            if (workbook != null) workbook.close();
 			if (fis != null) fis.close();
 			if (fos != null) fos.close();
    	}
    	catch(IOException e)
    	{
    		throw new ExceptionUtility("Not Able to add the Green Colour into given cell");
    	}
    	
    }
    
    public static synchronized void fillRedColor(String filePath, String sheetName, int rowNum, int cellNum)
    {
    	try
    	{
    		fis = new FileInputStream(filePath);
    		workbook = new XSSFWorkbook(fis);
    		sheet = workbook.getSheet(sheetName);
    		row = sheet.getRow(rowNum);
    		
    		style = workbook.createCellStyle();
    		style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
    		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    		cell = row.getCell(cellNum);
    		cell.setCellStyle(style);
    		 fos = new FileOutputStream(filePath);
             workbook.write(fos);

            if (workbook != null) workbook.close();
 			if (fis != null) fis.close();
 			if (fos != null) fos.close();
    		
    	}
    	catch(IOException e)
    	{
    		throw new ExceptionUtility("Not able to fill Red Color into given cell");
    	}
    }	
    
//  Get the row number By test case ID
    
  public synchronized static int getRowNumberByTestCaseID(String path, String sheetName, String TestCaseID)
  {
  	try 
  	{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			
			int totalRows = sheet.getLastRowNum();
			
			for(int i = 1; i <= totalRows; i++  )
			{
				String cellValue = sheet.getRow(i).getCell(1).toString();
				
				if(cellValue.equalsIgnoreCase(TestCaseID))
				{
					workbook.close();
					fis.close();
					return i;
				}
			}
			
			workbook.close();
	        fis.close();

	        return -1;
			
		} 
  	catch (Exception e) 
  	{
			e.printStackTrace();
			return -1;
		}
  	
  }
    
}
