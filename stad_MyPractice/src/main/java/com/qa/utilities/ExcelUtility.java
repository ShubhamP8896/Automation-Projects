package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.exceptions.FrameworkException;

public class ExcelUtility 
{
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	private static XSSFCellStyle style;
	private static final Logger logger = LogManager.getLogger(ExcelUtility.class);

	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @return
	 */
	public synchronized static int getLastRowNum(String filePath, String SheetName)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			int lastRowNum = sheet.getLastRowNum();
			
			 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
				logger.info(
					    "Fetching last row from sheet '{}'",
					    SheetName);
			return lastRowNum;
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rowNum
	 * @return
	 */
	public synchronized static int getLastCellNum(String filePath, String SheetName, int rowNum)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			int lastCellNum = row.getLastCellNum();
			
			 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
				logger.info("Fetching the last row Number");
			return lastCellNum;
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public synchronized static String getCellStringData(String filePath, String SheetName, int rowNum, int cellNum)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			String data = cell.toString();
			
			 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
				logger.info("Fetching the String data from an Excel File");
			return data;
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public synchronized static long getCellNumericData(String filePath, String SheetName, int rowNum, int cellNum)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			long data = (long) cell.getNumericCellValue();
			
			 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
				logger.info("Fetching the Numeric data from an Excel file");
			return data;
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public synchronized static double getCellFloatData(String filePath, String SheetName, int rowNum, int cellNum)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(cellNum);
			double data = cell.getNumericCellValue();
			logger.info("Fetching the floating data from an Excel file");
			 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
			
			return data;
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @param value
	 */
	public synchronized static void setDataIntoExcel(String filePath, String SheetName, int rowNum, int cellNum, String value)
	{
		try 
		{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(SheetName);
			if(sheet == null)
			{
				sheet = workbook.createSheet(SheetName);
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
			
			cell.setCellValue(value);
			
			fos= new FileOutputStream(filePath);
			workbook.write(fos);
			logger.info("Added the data into Excel file");
			if (workbook != null) workbook.close();
			if (fis != null) fis.close();
			if (fos != null) fos.close();
			
			
		} catch (IOException e) 
		{
			logger.error("Excel File is not load");
			throw new FrameworkException("Excel File is not found, Please check the file path" , e);
		}
	}
	
/**
 *  
 * @param filePath
 * @param sheetName
 * @param rowNum
 * @param colNum
 */
    public synchronized static void fillGreenColor(String filePath, String sheetName, int rowNum, int colNum) 
    {
        try 
        {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);

            row = sheet.getRow(rowNum);
            if (row == null)
                row = sheet.createRow(rowNum);
            
// This code is important for fill the color in the cell           
            style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell = row.getCell(colNum);
//            if (cell == null)
//                cell = row.createCell(colNum);

            cell.setCellStyle(style);

            fos = new FileOutputStream(filePath);
            workbook.write(fos);

            if (workbook != null) workbook.close();
			if (fis != null) fis.close();
			if (fos != null) fos.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
/**
 * 
 * @param filePath
 * @param sheetName
 * @param rowNum
 * @param colNum
 */
    public synchronized static void fillRedColor(String filePath, String sheetName, int rowNum, int colNum) 
    {
        try 
        {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);

            row = sheet.getRow(rowNum);
//            if (row == null)
//                row = sheet.createRow(rowNum);
            
// This code is important for fill the color in the cell           
            style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.RED.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell = row.getCell(colNum);
//            if (cell == null)
//                cell = row.createCell(colNum);

            cell.setCellStyle(style);

            fos = new FileOutputStream(filePath);
            workbook.write(fos);

            if (workbook != null) workbook.close();
			if (fis != null) fis.close();
			if (fos != null) fos.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }  

	
}
