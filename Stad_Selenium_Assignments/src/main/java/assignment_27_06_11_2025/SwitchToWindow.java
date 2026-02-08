package assignment_27_06_11_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchToWindow {

    public static void main(String[] args) throws InterruptedException {

        BrowserUtility bu = new BrowserUtility();
        WebDriver driver = bu.launchBrowser("Chrome");
        bu.launchURL("https://vinothqaacademy.com/multiple-windows/");
        bu.MaximizeWindow();

        By newWindow = By.xpath("(//button[@id='button1'])[1]");
        By newTab = By.xpath("(//button[@id='button1'])[2]");
        By newMsgWindow = By.xpath("(//button[@id='button1'])[3]");
        By text = By.xpath("//body[text()='Welcome to Vinoth Q. A Academy. Happy Learning']");

        ElementsUtility eu = new ElementsUtility(driver);

        String mainWindow = driver.getWindowHandle();

        // ---------- NEW WINDOW ----------
        eu.doClick(newWindow);
        String win1 = getNewWindow(driver, mainWindow);
        driver.switchTo().window(win1);
        System.out.println(bu.getCurrentPageURL());
        driver.close();
        driver.switchTo().window(mainWindow);

        // ---------- NEW TAB ----------
        eu.doClick(newTab);
        String win2 = getNewWindow(driver, mainWindow);
        driver.switchTo().window(win2);
        System.out.println(bu.getCurrentPageURL());
        driver.close();
        driver.switchTo().window(mainWindow);

        // ---------- NEW MESSAGE WINDOW ----------
        eu.doClick(newMsgWindow);
        String win3 = getNewWindow(driver, mainWindow);
        driver.switchTo().window(win3);
        System.out.println(bu.getCurrentPageURL());
        System.out.println(eu.getElementText(text));
        driver.close();
        driver.switchTo().window(mainWindow);

        System.out.println(bu.getCurrentPageURL());
    }

    // **** Utility to fetch newly opened window only ****
    public static String getNewWindow(WebDriver driver, String mainWin) {
        Set<String> all = driver.getWindowHandles();
        for (String h : all) {
            if (!h.equals(mainWin)) {
                return h;
            }
        }
        return null;
    }
}
