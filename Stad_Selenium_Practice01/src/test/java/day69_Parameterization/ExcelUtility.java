package day69_Parameterization;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtility 
{
    private static Workbook workbook;
    private static Sheet sheet;

    public String getCellData(String filePath, String sheetName, int rowNum, int colNum) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);

            String data = sheet.getRow(rowNum).getCell(colNum).toString();

            workbook.close();
            fis.close();

            return data;
        } 
        catch (Exception e) 
        {
            return "";
        }
    }

    public void setCellData(String filePath, String sheetName, int rowNum, int colNum, String value) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);
            if (row == null)
                row = sheet.createRow(rowNum);

            Cell cell = row.getCell(colNum);
            if (cell == null)
                cell = row.createCell(colNum);

            cell.setCellValue(value);

            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);

            workbook.close();
            fis.close();
            fos.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
