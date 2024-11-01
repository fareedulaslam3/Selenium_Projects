package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\28-09-2024\\eclipse-workspace\\SeL_sample\\Driver129\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ide']"));
		
		Select s=new Select(dropdown);
		System.out.println(s.isMultiple());
		
		Thread.sleep(2000);
		s.selectByVisibleText("Visual Studio");
		s.selectByVisibleText("IntelliJ IDEA");
		s.selectByVisibleText("NetBeans");
		
		
		
		List<WebElement> alloptions = s.getOptions();
		
	 for(WebElement w : alloptions)
	 {
		System.out.println(w.getText());
	}
//		----------------------------------------------->
	 List<WebElement> Allselected = s.getAllSelectedOptions();
	 
		for(WebElement e:Allselected)	
		{
		System.out.println(e.getText());
		}
		
//		----------------------------------------------->	
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
	//	----------------------------------------------->
		s.deselectByVisibleText("Visual Studio");
	}

	
}
