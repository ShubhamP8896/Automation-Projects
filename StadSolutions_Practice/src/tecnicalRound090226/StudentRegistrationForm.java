package tecnicalRound090226;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StudentRegistrationForm 
{
	static WebDriver driver;
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void addInput(By locator, String text)
	{
		getElement(locator).sendKeys(text);
	}
	
	public static void selectByIndex(By locator, int index)
	{
		Select si = new Select(getElement(locator));
		si.selectByIndex(index);
		System.out.println("Selected the option from dropdown as per Index : " + index);
	}
	public static void selectByValue(By locator, String Value)
	{
		Select si = new Select(getElement(locator));
		si.selectByValue(Value);
		System.out.println("Selected the option from dropdown as per Value : " + Value);
	}
	public static void selectByVisibleText(By locator, String visibleText)
	{
		Select si = new Select(getElement(locator));
		si.selectByVisibleText(visibleText);
		System.out.println("Selected the option from dropdown as per visible text : " + visibleText);
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		By name = By.xpath("//input[@id='name']");
		By Email = By.xpath("//input[@id='email']");
		By gender = By.xpath("//input[@type='radio']");
		By mobile = By.xpath("//input[@id='mobile']");
		By calender = By.xpath("//input[@id='dob']");
		By subject = By.xpath("//input[@id='subjects']");
		By hobbie1 = By.xpath("//input[@id='hobbies']");
		By hobbie2 = By.xpath("(//input[@class='form-check-input mt-0'])[5]");
		By hobbie3 = By.xpath("(//input[@class='form-check-input mt-0'])[6]");
		By uploadFl = By.xpath("//input[@id='picture']");
		By address = By.xpath("//textarea[@id='picture']");
		By state = By.xpath("//select[@id='state']");
		By city = By.xpath("//select[@id='city']");
		By logintButton = By.xpath("//input[@value='Login']");
		WebElement cal = getElement(calender);
		
		addInput(name , "Shubham Pawar");
		addInput(Email, "shubham@test.com");
		
//		Random click during each run
		List<WebElement> genderRadios = driver.findElements(gender);
		Random random = new Random();
		int index = random.nextInt(genderRadios.size());
		genderRadios.get(index).click();
		
//		driver.findElement(gender).click();
		addInput(mobile, "123456789");
		cal.sendKeys("0808", Keys.TAB);
		addInput(calender, "1996");	
		addInput(subject, "Automation");
		driver.findElement(hobbie1).click();
		driver.findElement(hobbie2).click();
		driver.findElement(hobbie3).click();
		addInput(uploadFl, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\JIRA.txt");
		addInput(address, "India");
		
		selectByValue(state, "Rajasthan");
		selectByValue(city, "Agra");
		
		getElement(logintButton).click();
		
	}

}
