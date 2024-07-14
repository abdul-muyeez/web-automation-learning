package webauto.it.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class WebElementSendKey extends BaseDriver {
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	@Test
	public void sendKeyExample() throws InterruptedException {
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("muyeez");
		Thread.sleep(5000);
	 
	}
	
	
	

}
