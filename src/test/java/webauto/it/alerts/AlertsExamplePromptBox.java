package webauto.it.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webauto.it.bd.BaseDriver;

public class AlertsExamplePromptBox extends BaseDriver{
	@BeforeClass
	public void openurl() {
		driver.get("https://demoqa.com/alerts");
		
	}  
	@Test
	public void alerts() throws InterruptedException {
		WebElement promptBox = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptBox.click();
		Thread.sleep(2000);
		
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("muyeez");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		
		
	}
	

}
