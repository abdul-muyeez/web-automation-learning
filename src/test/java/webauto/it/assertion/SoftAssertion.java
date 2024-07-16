package webauto.it.assertion;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import webauto.it.bd.BaseDriver;

public class SoftAssertion extends BaseDriver{

	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
	}
	@Test
	public void softAssertion () {
		String expectedTitle= "Selenium Practice - Registe";
		String actualTitle= driver.getTitle();
		
		SoftAssert softAssert= new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Title: "+actualTitle);
		
		softAssert.assertAll();
		
		
	}
	
}
