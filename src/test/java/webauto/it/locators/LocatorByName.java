package webauto.it.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class LocatorByName  extends BaseDriver{

	
	@BeforeClass
	public void openURL() {
		
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void locateByID() throws InterruptedException {
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(5000);
	}
	
}
