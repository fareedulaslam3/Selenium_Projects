package Selenium;

	
	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Windowshandling {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver .get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
//		    ---------------------------------->>> WindowHandle
			String parentwindow = driver.getWindowHandle();
			
			System.out.println(parentwindow );
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("newWindowBtn")).click();
			
//			------------------------------------->>> WindowHandles
			Set<String> Childwindow = driver.getWindowHandles();
			
			for(String x: Childwindow)
			{
				System.out.println(x);
			
			
			if(!x.equals(parentwindow )) {
				
				System.out.println(x);
				driver.switchTo().window(x);
				driver.manage().window().maximize();
				
			}
			}}}
			
	
			
			
			
			
			
		
	


