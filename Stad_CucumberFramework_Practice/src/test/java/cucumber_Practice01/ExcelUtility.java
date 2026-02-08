package cucumber_Practice01;

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
    public static int getRowCount(String filePath, String sheetName)
    {
    	try 
    	{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
	        sheet = workbook.getSheet(sheetName);
	    	int rowNo = sheet.getLastRowNum();
	    	
	    	 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
	    	
	    	return rowNo;	
		} 
    	catch (IOException e) 
    	{
			e.printStackTrace();
			return -1 ;
		} 
    }
    
/// To get the Cell Count : Need to pass in the argument file path, sheet name, and row Number for that specific cell count we want.
    public static int getCellCount(String filePath, String sheetName, int rowNum)
    {
    	
    	try 
    	{
			fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
	        sheet = workbook.getSheet(sheetName);
	    	row = sheet.getRow(rowNum);
	    	int cellNo = row.getLastCellNum();
	    	
	    	 if (workbook != null) workbook.close();
				if (fis != null) fis.close();
				
	    	return cellNo;
		} 
    	catch (IOException e) 
    	{
			e.printStackTrace();
			return -1;
		}
        
    }
    
/// To get the specific cell data  : Method is static so we are able to call this with the class name 
    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) 
    {
        try 
        {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
            
            String data = sheet.getRow(rowNum).getCell(colNum).toString();

            if (workbook != null) workbook.close();
			if (fis != null) fis.close();

            return data;
        } 
        catch (Exception e) 
        {
        	e.printStackTrace();
            return "";
        }
    }
 
/// To write the data in the specific cell : Method is static so we are able to call this with the class name 
    public static void setCellData(String filePath, String sheetName, int rowNum, int colNum, String value) 
    {
        try 
        {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);

            row = sheet.getRow(rowNum);
            if (row == null)
                row = sheet.createRow(rowNum);

            cell = row.getCell(colNum);
            if (cell == null)
                cell = row.createCell(colNum);

            cell.setCellValue(value);

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
        
/// To add Green color in the cell : Method is static so we are able to call this with the class name 
        public static void fillGreenColor(String filePath, String sheetName, int rowNum, int colNum) 
        {
            try 
            {
                fis = new FileInputStream(filePath);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheet(sheetName);

                row = sheet.getRow(rowNum);
                if (row == null)
                    row = sheet.createRow(rowNum);
                
//     This code is important for fill the color in the cell           
                style = workbook.createCellStyle();
                style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                cell = row.getCell(colNum);
//                if (cell == null)
//                    cell = row.createCell(colNum);

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
        
/// To add Red color in the cell : Method is static so we are able to call this with the class name 
        public static void fillRedColor(String filePath, String sheetName, int rowNum, int colNum) 
        {
            try 
            {
                fis = new FileInputStream(filePath);
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheet(sheetName);

                row = sheet.getRow(rowNum);
//                if (row == null)
//                    row = sheet.createRow(rowNum);
                
//     This code is important for fill the color in the cell           
                style = workbook.createCellStyle();
                style.setFillForegroundColor(IndexedColors.RED.getIndex());
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                cell = row.getCell(colNum);
//                if (cell == null)
//                    cell = row.createCell(colNum);

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
