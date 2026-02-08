package day72_73_DataDrivenFrameworkExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcelProgramForReadAndWrite 
{
	public static void main(String[] args) throws IOException
	{
//		Below is the hardcoded file path which is fetch file from the local folder from the system
		
//		String filePath = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx";
		
//		If we have excel file in out project on the eclipse then we are able to use this below code.
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\day72_73_DataDrivenFrameworkExcelFile\\Automation.xlsx";
		
		FileInputStream fis =  new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Registration");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(2);		
//		For print specific Cell 
		System.out.println(cell.toString());
		
		int totalRow = sheet.getLastRowNum();
		int totalCell = row.getLastCellNum();
		
		System.out.println("row : " + totalRow);
		System.out.println("cell : " + totalCell);
		
		//For Printing all the values use for loop
		System.out.println("Following is the data from an excel file : ");
		for(int i = 0; i < totalRow; i++)
		{
			for(int j =0; j < totalCell; j++ )
			{
				System.out.print(sheet.getRow(i).getCell(j).toString() + " ");
			}
			System.out.println();
		}
		
		XSSFRow newRow = sheet.getRow((8));
		newRow.getCell(0).setCellValue("8");
		newRow.getCell(1).setCellValue("New Cell");
		newRow.getCell(2).setCellValue("New Cell");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);			
		
		workbook.close();
		fis.close();
		fos.close();
		
	}

}
