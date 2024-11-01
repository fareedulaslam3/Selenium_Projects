package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		 //------------------>>> BY NAME OR ID
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("qwerty");
		
		 //------------------>>> BY WEBELEMENT REF		
	WebElement childframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
			driver.switchTo().frame(childframe);
		 driver.findElement(By.name("email")).sendKeys("ooityu");
		 
		 //------------------>>> PARENT FRAME
		 driver.switchTo().parentFrame();
		 driver.findElement(By.name("lname")).sendKeys("yuiop");
		 
		 //------------------>>> BY INDEX
		 driver.switchTo().frame(1);
		 driver.findElement(By.name("email")).clear();
		 
		 //------------------>>> DEFAULT CONTENT
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Work-Space']")).click();
	}

}
