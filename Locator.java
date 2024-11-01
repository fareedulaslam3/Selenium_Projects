package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

 WebElement username = driver.findElement(By.id("email"));
 username.sendKeys("aslam@gmail.com");
 
 WebElement password = driver.findElement(By.name("pass"));
 
 password.sendKeys("12345");

	WebElement button = driver.findElement(By.name("login"));
	button.click();
	
 
	}
	
}
