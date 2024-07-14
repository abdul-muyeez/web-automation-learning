package webauto.it.locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class LocatorByTagName  extends BaseDriver{

	
	@BeforeClass
	public void openURL() {
		
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void locateByTagName() throws InterruptedException {
		List<WebElement> tags= driver.findElements(By.tagName("a"));
		System.out.println("Size: "+tags.size());
	}
	
}
