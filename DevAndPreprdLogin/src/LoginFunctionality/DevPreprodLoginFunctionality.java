package LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DevPreprodLoginFunctionality {

    public static void main(String[] args) throws IOException {
        // Path of Excel File
        String path = "C:\\Users\\Shubz008\\Desktop\\Server Credentials\\Dev And Preprod Server List.xlsx";
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // Path of chromedriver and properties set
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
        System.out.println("System Property set successfully");
        
        WebDriver driver = new ChromeDriver();      
        driver.manage().window().maximize();
        System.out.println("Chrome Browser Opened Successfully and Maximized");

        for (int i = 1; i <= 16; i++) {
            try {
                String url = workbook.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
                driver.get(url);
                System.out.println("Url Fetched from Sheet :- " + url + " : Url opened Successfully");

                String username = workbook.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();
                WebElement usernameField = driver.findElement(By.id("user_email"));
                usernameField.sendKeys(username);
                System.out.println("Username Fetched from Sheet:- " + username + " : Username added Successfully");

                String password = workbook.getSheet("Sheet1").getRow(i).getCell(4).getStringCellValue();
                WebElement passwordField = driver.findElement(By.id("user_password"));
                passwordField.sendKeys(password);
                System.out.println("password Fetched from Sheet:- " + password + " : password added Successfully");

                WebElement loginButton = driver.findElement(By.id("login"));
                loginButton.click();
                System.out.println("Clicked on Login Button url = " + url);
                

                try {
                    Alert alert = driver.switchTo().alert();
                    String alertMessage = alert.getText();
                    alert.accept();
                    System.out.println("Alert message: " + alertMessage);
                    String result = "Test case is failed - Incorrect credentials. Alert message: " + alertMessage;
                    workbook.getSheet("Sheet1").getRow(i).createCell(5).setCellValue(result);
                } catch (Exception e) {
                    String expectedUrl = i == 1 ? "https://design.sniperai.com/recruiter/live-jobs"
                        : (i == 2 ? "https://sftest.sniperai.com/recruiter/live-jobs"
                                : (i == 3 ? "https://ixceedpreprod.sniperai.com/recruiter/live-jobs"
                                        : (i == 4 ? "https://afgpreprod.sniperai.com/recruiter/live-jobs"
                                                : (i == 5
                                                        ? "https://ab-inbevpreprod.sniperai.com/recruiter/live-jobs"
                                                        : (i == 6 ? "https://afgdev.sniperai.com/recruiter/live-jobs"
                                                                : (i == 7
                                                                        ? "https://atospreprod.sniperai.com/recruiter/live-jobs"
                                                                        : (i == 8
                                                                                ? "https://alcoapreprod.sniperai.com/recruiter/live-jobs"
                                                                                : (i == 9
                                                                                        ? "https://bajajautopreprod.sniperai.com/recruiter/live-jobs"
                                                                                        : (i == 10
                                                                                                ? "https://clearbridgetechpreprod.sniperai.com/recruiter/live-jobs"
                                                                                                : (i == 11
                                                                                                        ? "https://globallogic.sniperai.com/recruiter/live-jobs"
                                                                                                        : (i == 12
                                                                                                                ? "https://edgegrouppreprod.sniperai.com/recruiter/live-jobs"
                                                                                                                : (i == 13
                                                                                                                        ? "https://johnclementspreprod.sniperai.com/recruiter/live-jobs"
                                                                                                                        : (i == 14
                                                                                                                                ? "https://malaysiaairlinespreprod.sniperai.com/recruiter/live-jobs"
                                                                                                                                : (i == 15
                                                                                                                                        ? "https://ptteppreprod.sniperai.com/recruiter/live-jobs"
                                                                                                                                        : "https://recruitmentsmartpreprod.sniperai.com/recruiter/live-jobs"))))))))))))));
                    String actualUrl = driver.getCurrentUrl();

                    String result;
                    if (expectedUrl.equals(actualUrl)) {
                        result = "Test Case is passed";
                    } else {
                        result = "Test case is failed - Incorrect credentials";
                    }

                    workbook.getSheet("Sheet1").getRow(i).createCell(5).setCellValue(result);

                    WebElement sidebar = driver.findElement(By.id("manu-icn-exp-col"));
                    sidebar.click();

                    WebElement logout = driver.findElement(By.linkText("Sign out"));
                    logout.click();
                }
            } catch (NoSuchElementException e) {
                String errorMessage = "No such element found. Please check the locator or webpage.";
                System.out.println(errorMessage);
                workbook.getSheet("Sheet1").getRow(i).createCell(5).setCellValue(errorMessage);
            } catch (Exception e) {
                String errorMessage = "WebDriver exception occurred: " + e.getMessage();
                System.out.println(errorMessage);
                workbook.getSheet("Sheet1").getRow(i).createCell(5).setCellValue(errorMessage);
            }
        }

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        driver.quit();
        System.out.println("End of Program");

    }

}
