package webauto.it.browsercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class BrowserCommands extends BaseDriver {
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
	@Test
	public void browserCommandsExamples() {
		WebElement commands = driver.findElement(By.xpath("//a[@href=\"https://www.tutorialspoint.com\"]"));
		
		System.out.println(driver.getTitle());
		
		String actualTitle =driver.getTitle();
		String expectedTitle= "Selenium Practice - Student Registration Form";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(driver.getTitle());
		}else {
			System.out.println("Not Match");
		}
		
		System.out.println(driver.getCurrentUrl());
		
	}
	

}
