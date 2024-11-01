package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousepointer {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
//------------------------>>CLICK
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	a.click(mobile).build().perform();
	Thread.sleep(2000);
//------------------------------>>>MOVETOELEMENT
		WebElement move = driver.findElement(By.xpath("(//a[@aria-haspopup='true'])[1]"));
		Thread.sleep(2000);
	a.moveToElement(move).build().perform();
		
	driver.get("https://demoqa.com/droppable/");
//	------------------------------------------------------>>>>DRAGANDDROP
	WebElement drag = driver.findElement(By.id("draggable"));
	a.click(drag).build().perform();
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();
//------------------------------------------------------------------------------>>>>DOUBLECLICK
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement dbclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	a.doubleClick(dbclick).build().perform();
	driver.switchTo().alert().accept();
		
//		---------------------->>>Clickandhold
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement clickhold = driver.findElement(By.xpath("//li[@name='A']"));
		driver.manage().window().maximize();
		a.clickAndHold(clickhold).build().perform();
		Thread.sleep(2000);
		
		a.release(clickhold).build().perform();
		
		
	}
}
