package webauto.it.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class LocatorByClassName  extends BaseDriver{

	
	@BeforeClass
	public void openURL() {
		
	driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void locateByClassName() throws InterruptedException {
		WebElement button= driver.findElement(By.className("bld-txt"));
		button.click();
		Thread.sleep(5000);
	}
	
}
