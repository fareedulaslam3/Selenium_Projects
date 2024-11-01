package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	// relative xpath -- starts with //
//	                  -- find out from middle of the dom page
	// absolute xpath -- starts with /
//	                  -- find out from the start of the dom page
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//form/div[5]/a")).click();
	}
	
	

}
