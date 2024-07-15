package webauto.it.mouseaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class MouseHover extends BaseDriver {
	@BeforeClass
	public void openurl() {
		driver.get("https://www.daraz.com.bd/");
	}
		@Test
		public void hover() throws InterruptedException {
			Actions mouseaction = new Actions(driver);
			WebElement tvAndHome= driver.findElement(By.xpath("//span[contains(text(),'TV & Home Appliances')]"));
			mouseaction.moveToElement(tvAndHome).perform();
			Thread.sleep(2000);
			
			WebElement television= driver.findElement(By.xpath("//ul[@class='lzd-site-menu-root']/ul[7]/li[1]/a/span"));
			mouseaction.moveToElement(television).perform();
			Thread.sleep(2000);
		
			WebElement tvcatagory= driver.findElement(By.xpath("//span[contains(text(),'OLED Televisions')]"));
			mouseaction.moveToElement(tvcatagory).perform();
			Thread.sleep(5000);
		
	}
		
	
	

}
