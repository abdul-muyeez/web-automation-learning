package webauto.it.selectaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class SelectExmaples extends BaseDriver{
	
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
	@Test
	public void selectExamples() throws InterruptedException {
		
		WebElement stateAndCity= driver.findElement(By.id("state"));
		Select select =new Select (stateAndCity);
		
	    //Select by Index
		select.selectByIndex(2);
		Thread.sleep(3000);
	
		
		//Select by Value
		select.selectByValue("Rajasthan");
		Thread.sleep(4000);
		
		//Select by Visible text
		select.selectByVisibleText("NCR");
		Thread.sleep(5000);
		
	}

}
