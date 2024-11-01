package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		button.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Thread.sleep(2000);
		
		Select s = new Select(day);
		Thread.sleep(2000);
		s.selectByValue("8");
	}
	
}