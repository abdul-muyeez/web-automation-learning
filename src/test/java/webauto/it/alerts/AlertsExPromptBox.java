package webauto.it.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class AlertsExPromptBox extends BaseDriver {
	@BeforeClass
	public void openurl () {
		driver.get("https://demoqa.com/alerts");
	}
		@Test
		public void alertPromptBox() throws InterruptedException {
			WebElement promptBox = driver.findElement(By.xpath("//button[@id='promtButton']"));
			promptBox.click();
			Thread.sleep(5000);
			
	}
	

}
