package day72_73_DataDrivenFrameworkExcelFile;

public class ExcelFileReadAndWriteWithUtilityClass 
{
	public static void main(String[] args) 
	{
//		Now we are calling the Excel Utility class methods
		String filePath = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\StadAutomation\\Automation.xlsx";
		
//		To get the row count
		System.out.println("Total row:- "+ExcelUtility.getRowCount(filePath, "Registration"));
		
//		To get the cell count at row number 2
		System.out.println("Total cell:- "+ExcelUtility.getCellCount(filePath, "Registration", 2));
		
//		To get the cell data of row 1 and cell 2
		String dataFromExcel = ExcelUtility.getCellData(filePath, "Registration", 1, 2);
		System.out.println("data from row 1 and cell 2 :- "+dataFromExcel);
		
//		To get all the data from all the rows
		for(int i = 0 ; i< ExcelUtility.getRowCount(filePath, "Registration"); i++)
		{
			for(int j = 0; j<ExcelUtility.getCellCount(filePath, "Registration", i); j++)
			{
				System.out.print(ExcelUtility.getCellData(filePath, "Registration", i, j) + " ");
			}
			System.out.println();
		}
		
//		To set the data into the cell
		ExcelUtility.setCellData(filePath, "Registration", 7, 0, "7");
		ExcelUtility.setCellData(filePath, "Registration", 7, 1, "Designation");
		ExcelUtility.setCellData(filePath, "Registration", 7, 2, "QA");
		
		
	}
}
