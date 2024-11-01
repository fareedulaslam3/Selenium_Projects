package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/Samsung-Storage-Display-Charging-Security/dp/B0DFY3XCB6/ref=sr_1_3?crid=3H369E3XAR27Z&dib=eyJ2IjoiMSJ9.wQ9T254XRacqS5wcg7MgPC5L1sMmo8wFAoZu2QmBjKQ_");

	driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='₹9,999'][1]/parent::span/parent::span/ancestor::span/parent::div/preceding-sibling::div/child::span[2]"));
	element.getText();	
	}

	
}
