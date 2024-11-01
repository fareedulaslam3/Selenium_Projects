package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
//		------------------------------------------------------------------------->>ENTIRE DATA ON THE TABLE
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
	for (WebElement webtable : alldata) {
		
		System.out.println(webtable.getText());
			
		
			
//		------------------------------------------------------------------------->>TABLE ROW DATA ON THE TABLE
		List<WebElement> tableR = driver.findElements(By.xpath("//table/tbody/tr[78]/td"));
		
		for (WebElement webR: tableR) {
			
			System.out.println(webR.getText());
			
//			------------------------------------------------------------------------->>TABLE COLUMN DATA ON THE TABLE	
		List<WebElement> webC = driver.findElements(By.xpath("//table/tbody/tr/td[//table/tbody/tr/td[3]]"));
		
		for (WebElement web : webC) {
			
			System.out.println(web.getText());
			
//			------------------------------------------------------------------------->>PARTICULAR  DATA ON THE TABLE
			
	WebElement element = driver.findElement(By.xpath("//table/tbody/tr[85]/td[3]"));
	System.out.println(element.getText());
			
			
		}
		}
		
}		}}
		

