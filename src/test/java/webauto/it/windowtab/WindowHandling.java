package webauto.it.windowtab;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webauto.it.bd.BaseDriver;

public class WindowHandling extends BaseDriver {

	@BeforeClass
	public void upenurl() throws InterruptedException {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
	}
	@Test
	public void NewTab () throws InterruptedException {
		
		String parentTab= driver.getWindowHandle();
		
		//Create New tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		String childTab= driver.getWindowHandle();
		driver.get("https://www.daraz.com.bd/");
		Thread.sleep(2000);
		
		//Switch to Tab
		Set<String> allTabs= driver.getWindowHandles();
		System.out.println("Number of Tab: "+allTabs.size());
	
		driver.switchTo().window(parentTab);
		Thread.sleep(2000);
		driver.switchTo().window(childTab);
		Thread.sleep(2000);
		Thread.sleep(2000);
	}
	
	
}
