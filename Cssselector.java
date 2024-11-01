package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.cssSelector("#email")).sendKeys("LONE");//----->>tag [id=>unique]
		
		
			driver.findElement(By.cssSelector(".inputtext")).sendKeys("qwert"); 
//			----->>class=>[ take readable text]
		
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("qwert");----->>att name = value
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[placeholder ^=Password]")).sendKeys("asdfghj");----->>prefix
		
		//--------------------->>1 of 2 is not possible in CssSelector
		
		driver.findElement(By.cssSelector("[aria-label $='Password']")).sendKeys("ghjkl;");//---->>suffix
		
	driver.findElement(By.id("[name*='login']")).click();//--->>contains
		
		
	}
	

}
