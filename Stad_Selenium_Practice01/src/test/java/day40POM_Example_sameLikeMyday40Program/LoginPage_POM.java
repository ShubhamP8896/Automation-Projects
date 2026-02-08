
package day40POM_Example_sameLikeMyday40Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM{

    WebDriver driver;
    ElementsUtility eutil;

    // ✅ Page Locators
    private By email = By.id("input-email");
    private By password = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");
    private By forgotPasswordLink = By.linkText("Forgotten Password");

    // ✅ Constructor
    public LoginPage_POM(WebDriver driver) {
        this.driver = driver;
        eutil = new ElementsUtility(driver);
    }

    // ✅ Page Actions
    public void enterEmail(String userEmail) {
        eutil.addInput(email, userEmail);
    }

    public void enterPassword(String userPass) {
        eutil.addInput(password, userPass);
    }

    public void clickLogin() {
        eutil.doClick(loginBtn);
    }

    public boolean isForgotPasswordLinkDisplayed() {
        return driver.findElement(forgotPasswordLink).isDisplayed();
    }

    // ✅ Combined Action (High-level method)
    public void doLogin(String userEmail, String userPass) {
        enterEmail(userEmail);
        enterPassword(userPass);
        clickLogin();
    }
}