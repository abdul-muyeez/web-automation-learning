package webauto.it.selectaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class KeyBoardEvents extends BaseDriver{
	@BeforeClass
	public void openurl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		}
		@Test 
		public void copyAndPaste() throws InterruptedException {
			Actions action = new Actions(driver);
			
			WebElement firstName= driver.findElement(By.xpath("//input[@id='firstname']"));
			firstName.sendKeys("Muyeez");
			
			//Copy-> CTRL+A
			action.keyDown(Keys.CONTROL);
			action.sendKeys("a");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			
			action.keyDown(Keys.CONTROL);
			action.sendKeys("c");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			Thread.sleep(2000);
			
			//TAB->
			action.keyDown(Keys.TAB);
			action.build().perform();
			
			
			//Paste
			action.keyDown(Keys.CONTROL);
			action.sendKeys("v");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			Thread.sleep(3000);
			
		
			WebElement firstName2= driver.findElement(By.xpath("//input[@id='username']"));
			firstName2.click();
			
			action.keyDown(Keys.CONTROL);
			action.sendKeys("v");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			Thread.sleep(3000);
			
		}
	
	   }

