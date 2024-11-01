package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
//		------------------------------------------------------------->>>IMPLICIT WAIT
		
		driver.findElement(By.id("btn1")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement text1 =	driver.findElement(By.id("txt1"));
	text1.sendKeys("aslam");
	
//	------------------------------------------------------------->>>EXPLICIT WAIT
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(text1));
		
		WebElement wait1 = driver.findElement(By.id("btn2"));
		wait1.click();
		
	
		
		
	}
	
	

}
