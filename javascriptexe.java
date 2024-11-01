package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexe {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	js.executeScript("arguments[0].scrollIntoView()",aboutus);
		
	js.executeScript("arguments[0].click()",aboutus);
		
	js.executeScript("window.scroll(0,5000)");
		
	js.executeScript("window.scrollBy(0,-2000)");
		
		js.executeScript("window.scroll(0,0)");
		
	 js.executeScript("alert('aslam')");
	}

}
