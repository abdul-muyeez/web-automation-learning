package webauto.it.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class ExplicitWait extends BaseDriver{
	
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
	}
	@Test
	public void explicitWait() throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		WebElement firstName= driver.findElement(By.id("firstname"));
		firstName.sendKeys("Muyeez");
		Thread.sleep(5000);
		
		
	}

}
