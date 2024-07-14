package webauto.it.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class ClickCommand extends BaseDriver{
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	} 
	
	@Test
	public void clickExample() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[2]  "));
		element.click();
		Thread.sleep(5000);
		
	}

}
