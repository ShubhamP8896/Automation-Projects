package day64;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelPracticeMine1 
{
    public static void main(String[] args) throws IOException 
    {
        // Excel file path
        String filePath = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";

        // ================= READ DATA =================
        FileInputStream file = new FileInputStream(filePath);
        Workbook workBook = WorkbookFactory.create(file);

        Sheet sheet = workBook.getSheet("Sheet1"); // correct case
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(0);

        String value = cell.toString(); // safe reading
        System.out.println("Read value: " + value);

        // ================= WRITE DATA =================
        int newRowNum = sheet.getLastRowNum() + 1;
        Row newRow = sheet.createRow(newRowNum);

        newRow.createCell(0).setCellValue("Shubham");
        newRow.createCell(1).setCellValue("Pawar");

        FileOutputStream writeFile = new FileOutputStream(filePath);
        workBook.write(writeFile);

        // ================= CLOSE RESOURCES =================
        workBook.close();
        file.close();
        writeFile.close();

        System.out.println("Data written successfully");
    }
}
