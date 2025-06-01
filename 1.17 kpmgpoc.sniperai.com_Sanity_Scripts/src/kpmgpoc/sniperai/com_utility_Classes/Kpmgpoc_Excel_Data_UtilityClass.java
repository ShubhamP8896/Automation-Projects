package kpmgpoc.sniperai.com_utility_Classes;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Kpmgpoc_Excel_Data_UtilityClass {

    // Path of the Excel file
    private static final String EXCEL_FILE_PATH = "C:\\Users\\Shubz008\\Desktop\\Live Server_Sanity_Automation data\\2. Live Server Automation Saity Test Report.xlsx";

    // Method to read recruiter credentials from Excel
    public String[] readRecruiterCredentials(int rowIndex) throws IOException {
        try (FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheet("Test Data");
            XSSFRow row = sheet.getRow(rowIndex);                     // Row index 1 for recruiter
            String Rusername = row.getCell(2).getStringCellValue(); // Username in column C (index 2)
            String Rpassword = row.getCell(3).getStringCellValue(); // Password in column D (index 3)
            return new String[]{Rusername, Rpassword};
        }
    }

    // Method to read candidate credentials from Excel
    public String[] readCandidateCredentials(int rowIndex) throws IOException {
        try (FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheet("Test Data");
            XSSFRow row = sheet.getRow(rowIndex);                        // Row index 2 for candidate
            String Cusername = row.getCell(2).getStringCellValue(); // Username in column C (index 2)
            String Cpassword = row.getCell(3).getStringCellValue(); // Password in column D (index 3)
            return new String[]{Cusername, Cpassword};
            
        }
    }

    public static void writeResult(String actualResult) throws IOException 
    {
        try (FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(file))
        {

            XSSFSheet sheet = workbook.getSheet("kpmgpoc");

            // Find the next empty row starting from row index 1
            int rowNum = getNextEmptyRow(sheet);
            System.out.println("Writing result to row number: " + rowNum);
            writeCell(sheet, rowNum, actualResult);

            // Save the changes
            try (FileOutputStream fos = new FileOutputStream(EXCEL_FILE_PATH)) 
            {
                workbook.write(fos);
            }
        }
    }

    private static int getNextEmptyRow(XSSFSheet sheet) {
        // Start from the second row (row index 1) as row index 0 is typically header
        int rowNum = 1;
        while (rowNum <= sheet.getLastRowNum()) {
            XSSFRow row = sheet.getRow(rowNum);
            if (row == null || row.getCell(5) == null || row.getCell(5).getCellType() == CellType.BLANK) 
            {
                break;
            }
            rowNum++;
        }
        return rowNum;
    }

    private static void writeCell(XSSFSheet sheet, int rowNum, String value) {
        XSSFRow row = sheet.getRow(rowNum);
        if (row == null) {
            row = sheet.createRow(rowNum);
        }
        Cell cell = row.createCell(5); // Assuming column E (index 5 for "Actual Result"
        cell.setCellValue(value);
    }
}
