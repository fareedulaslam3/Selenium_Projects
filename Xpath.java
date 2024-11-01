package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aslam345678");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		
//	     driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	}
}
