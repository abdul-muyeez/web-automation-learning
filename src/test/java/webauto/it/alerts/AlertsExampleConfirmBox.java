package webauto.it.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webauto.it.bd.BaseDriver;

public class AlertsExampleConfirmBox extends BaseDriver{
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
	}
	@Test
	public void alerts() throws InterruptedException {
		WebElement confirmAlertBox = driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
		confirmAlertBox.click();
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		Thread.sleep(5000);
	}
	
	
}
