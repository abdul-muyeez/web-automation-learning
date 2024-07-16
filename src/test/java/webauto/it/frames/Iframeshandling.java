package webauto.it.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class Iframeshandling extends BaseDriver{
	@BeforeClass
	public void upenurl() {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	}
	
	@Test (priority = 0)
	public void countFrame () {
		
		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
	}
	@Test(priority = 1)
	public void switchToFrame() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		driver.switchTo().frame("frame1");
		WebElement text= driver.findElement(By.xpath("//h1[contains(text(),'New Tab')]"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();
		
	WebElement button =driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/button[1]"));
	button.click();
	Thread.sleep(5000);
	}
	
	

}
