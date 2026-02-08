package day50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		WebElement gs = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		
		System.out.println(gs.getAttribute("value"));
		
		
	}
}
