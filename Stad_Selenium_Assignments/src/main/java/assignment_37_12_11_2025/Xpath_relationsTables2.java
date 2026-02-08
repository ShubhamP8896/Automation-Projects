package assignment_37_12_11_2025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_relationsTables2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		 // Locate all rows of table body
		List<WebElement> rowData = driver.findElements(By.xpath("//td[@scope='row']")); 
		
//		Dynamic array for store the Unique data
		Set<String> unique = new HashSet<String>();
		
//		To store the index and delete that data.
		List<Integer> duplicateRowIndexes = new ArrayList <Integer>();
		
		  // Step 1: Identify duplicate rows
        for (int i = 0; i < rowData.size(); i++) 
        {
            String rowText = rowData.get(i).getText().trim();

            if (!unique.add(rowText)) 
            {
                // already exists → it's duplicate
                duplicateRowIndexes.add(i + 1); // +1 because XPath row index starts at 1
            }
        }
        
        System.out.println("Duplicate rows found at indexes: " + duplicateRowIndexes);
        
     // Step 2: Delete duplicate rows (if delete option exists)       
        for (int i = duplicateRowIndexes.size() - 1; i >= 0; i--) 
        {
            Integer rowIndex = duplicateRowIndexes.get(i);
            
            // Find the delete icon in the current row and click it
            WebElement deleteIcon = driver.findElement(By.xpath("(//td//a[@title='delete'])[" + rowIndex + "]"));
            deleteIcon.click();
            
            System.out.println("Deleted Entry : " + rowIndex);
        }
        
	}
	
}

