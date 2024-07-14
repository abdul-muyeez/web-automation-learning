package webauto.it.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class ClearCommand extends BaseDriver {
	
		@BeforeClass
		public void openurl() {
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		}
	
@Test
public void clearExample() throws InterruptedException {
	WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("muyeez");
	Thread.sleep(5000);
	firstname.clear();
	Thread.sleep(3000);
	firstname.sendKeys("Muyeez");
	Thread.sleep(5000);
}

	

}
