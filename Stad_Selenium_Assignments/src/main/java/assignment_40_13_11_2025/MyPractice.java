package assignment_40_13_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPractice 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/webtable/");
		
		driver.manage().window().maximize();
		
		By name = By.cssSelector("input#nameInput");
		By role = By.cssSelector("input#roleInput");
		By email = By.cssSelector("input#emailInput");
		By location = By.cssSelector("input#locationInput");
		By department = By.cssSelector("input#departmentInput");
		By add = By.cssSelector("button#addBtn");
		By delete = By.cssSelector("button#deleteBtn");
		
		driver.findElement(name).sendKeys("Shubham");
		driver.findElement(role).sendKeys("QA");
		driver.findElement(email).sendKeys("sp@yopmail.com");
		driver.findElement(location).sendKeys("India");
		driver.findElement(department).sendKeys("QA");
		driver.findElement(add).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='Shubham']/preceding-sibling::td/input")).click();
		driver.findElement(delete).click();
		
		
		
		
		
		
		
		
	}

}
