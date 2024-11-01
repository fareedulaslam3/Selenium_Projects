package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	
	public static void main(String[] args) {
	System.setProperty( "webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox ");
	driver.manage().window().maximize();
	
Dimension dimension=new Dimension(800, 800);
	driver.manage().window().setSize(dimension);
	
	Point point=new Point(500, 500);
	driver.manage().window().setPosition(point);
	
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
	
//	System.out.println(driver.getPageSource());
	
	
	
	}
}
