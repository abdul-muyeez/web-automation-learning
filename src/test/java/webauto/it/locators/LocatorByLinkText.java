package webauto.it.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class LocatorByLinkText  extends BaseDriver{

	
	@BeforeClass
	public void openURL() {
		
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void locateByPartialLink() throws InterruptedException {
		WebElement forgetpassword= driver.findElement(By.partialLinkText("Forgotten"));
		forgetpassword.click();
		Thread.sleep(5000);
	}
	
}
