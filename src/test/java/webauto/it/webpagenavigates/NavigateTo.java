package webauto.it.webpagenavigates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class NavigateTo extends BaseDriver{
	
	@BeforeClass
	public void openurl () {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
		
		@Test
		public void nagivateToExmaple() throws InterruptedException {
			WebElement element = driver.findElement(By.xpath("//a[@href=\"https://www.tutorialspoint.com\"]"));
			element.click();	
			Thread.sleep(5000);
		 
			driver.navigate().back();
			Thread.sleep(1500);
			
			driver.navigate().forward();
			Thread.sleep(1500);
			
			driver.navigate().refresh();
			Thread.sleep(2000);
			
		
		
	}
	
	//driver.findelement(By.xpath("//a[@href="https://www.tutorialspoint.com"]")).click();
	

}
