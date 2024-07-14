package webauto.it.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class LocatorByXpathSelector  extends BaseDriver{

	
	@BeforeClass
	public void openURL() {
		
	driver.get("https://www.daraz.com.bd/");
	
	}
	/*
	@Test
	public void locateByXpath() throws InterruptedException {
		WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Abdul Muyeez");
		Thread.sleep(5000);
	} */
	
	@Test
	public void locateByXpath1() throws InterruptedException {
		WebElement flashsale= driver.findElement(By.xpath("//*[@class='page regional_bd']/div[4]/div[1]/h3"));
	System.out.println(flashsale.getText());
		Thread.sleep(5000);
	}
}

/* 
 * If unique one is not found
 * Reletive Xpath->  //tagName[@attribute=value] or
 *               ->  //*[@attribute=value]
 *               ->  //*[contains(text(), 'Student Registration Form')]
 *               ->  //*[@class='page regional_bd']/div[4]/div[1]/h3"
 *               
 */