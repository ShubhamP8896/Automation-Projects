package day57;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination2MultipleSelection {
    public static void main(String[] args) throws InterruptedException {
        BrowserUtility bu = new BrowserUtility();
        WebDriver driver = bu.launchBrowser("chrome");
        bu.MaximizeWindow();
        bu.launchURL("https://selectorshub.com/xpath-practice-page/");

        Thread.sleep(5000);
        
        ElementsUtility eu = new ElementsUtility(driver);

        By country = By.xpath("//td[text()='India']");
        By checkBox = By.xpath("//td[text()='India']/preceding-sibling::td[@class='column-1']/input");
        By nextButton = By.cssSelector("button.dt-paging-button.next");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        while (true) 
        {
            // Check if the country is found on the current page
            if (eu.getElements(country).size() > 0) 
            {
                // Find all checkboxes for 'India' on the current page
                List<WebElement> checkBoxes = eu.getElements(checkBox);

                // Wait for all checkboxes to be visible
                wait.until(ExpectedConditions.visibilityOfAllElements(checkBoxes));

                // Loop through the checkboxes and click each one if it's not selected
                for (WebElement cb : checkBoxes) 
                {
                    // Wait for each check box to be click able
                    wait.until(ExpectedConditions.elementToBeClickable(cb)).click();
                }

                // Check if the 'Next' button is click able and navigate to the next page
                WebElement nextBtn = eu.getElement(nextButton);
                if (!nextBtn.getAttribute("class").contains("disabled")) 
                {
                    wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
                } else 
                {
                    System.out.println("All Pages searched");
                    break;
                }
            } 
            else 
            {
                // If India is not found on the current page, go to the next page if possible
                WebElement nextBtn = eu.getElement(nextButton);
                if (!nextBtn.getAttribute("class").contains("disabled")) 
                {
                    wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
                } else 
                {
                    System.out.println("India not found in any page.");
                    break;
                }
            }
        }
        driver.quit(); // Close the browser at the end
    }
}
