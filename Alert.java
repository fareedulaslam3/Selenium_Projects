package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html\r\n");
		
		//NORMAL ALERT
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')] ")).click();
		 Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//---------------------------------------------------------------->
		//COMFIRM ALERT
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//a [text()='Alert with OK & Cancel ']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button [text()='click the button to display a confirm box ']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().dismiss();	 
		 //__________________________________________________________>
		//PROMPT ALERT
		 driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		 
		 alert.sendKeys("aslam");
		 alert.accept();
	}
	
	
}
