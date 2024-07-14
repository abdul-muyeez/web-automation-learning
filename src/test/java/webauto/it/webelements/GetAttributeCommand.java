package webauto.it.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class GetAttributeCommand extends BaseDriver {
	

	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	} 
	
	@Test
	public void getAttribute() throws InterruptedException {
		WebElement firstName = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		System.out.println(firstName.getAttribute("placeholder"));
		Thread.sleep(5000);
		
	}
	
	
	

}
