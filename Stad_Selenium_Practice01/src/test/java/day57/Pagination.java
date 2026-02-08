package day57;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Pagination {

    public static void main(String[] args) throws InterruptedException {
        BrowserUtility bu = new BrowserUtility();
        WebDriver driver = bu.launchBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        bu.launchURL("https://selectorshub.com/xpath-practice-page/");
        Thread.sleep(5000);
        
        ElementsUtility eu = new ElementsUtility(driver);
        
        // Locator for the country name in the table
        By country = By.cssSelector("td.column-5");
        
        // Locator for the checkbox corresponding to the 'Hong Kong' entry
        By checkBox = By.xpath("//td[text()='Hong Kong']/preceding-sibling::td[@class='column-1']");
        
        // Locator for the 'Next' button
        By nextButton = By.cssSelector("button.dt-paging-button.next");

        // Start a loop to go through pages and find 'Hong Kong'
        boolean found = false;
        while (!found) 
        {
            // Get the list of countries on the current page
            List<WebElement> countryList = eu.getElements(country);
            
            // Loop through the country list to find "Hong Kong"
            for (WebElement cl : countryList) {
                if (cl.getText().equals("Hong Kong")) {
                    // If found, click the checkbox and exit the loop
                    eu.doClick(checkBox);
                    found = true;
                    System.out.println("Hong Kong is found and clicked on the CheckBox");
                    break;
                }
            }
            
            if (!found) 
            {
                // If not found, check if the 'Next' button is enabled
                WebElement nextBtn = driver.findElement(nextButton);
                if (!nextBtn.getAttribute("class").contains("disabled")) 
                {
                    // Click 'Next' to go to the next page
                    eu.doClick(nextButton);
                    // Wait for the table or page content to load
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    wait.until(ExpectedConditions.presenceOfElementLocated(country)); // wait for countries to load
                } 
                else 
                {
                    // If 'Next' is disabled, we've reached the last page
                    System.out.println("Reached last page, 'Hong Kong' not found.");
                    break;
                }
            }
        }
        
        // Optionally, close the browser after task completion
        driver.quit();
    }
}
