package webauto.it.assertion;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class HardAssertion extends BaseDriver{

	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
	}
	@Test
	public void hardAssertion () {
		String expectedTitle= "Selenium Practice - Registe";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Title: "+actualTitle);
		
	}
	
}
