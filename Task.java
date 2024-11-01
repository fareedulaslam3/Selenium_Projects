package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[1]"));
		dropdown1.click();
		Thread.sleep(2000);

		WebElement select1 = driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 1')]"));
		select1.click();
		Thread.sleep(2000);
		
		WebElement dropdown2 = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[2]"));
		dropdown2.click();
		Thread.sleep(2000);
		
		WebElement select2 = driver.findElement(By.xpath("//div[contains(text(),'Mr.')]"));
		select2.click();
		Thread.sleep(2000);
		
		WebElement select3 = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		select3.click();
		
		Select s = new Select(select3);
		
		s.selectByVisibleText("Purple");
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}