package webauto.it.scrollaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToElement {
	

		protected static String url = "https://www.tutorialspoint.com/index.htm";
		WebDriver driver;

		@BeforeSuite
		public void startChromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		@BeforeClass
		public void openUrl() {
			driver.get(url);
		}

		@Test(priority = 0)
		public void scrollToSpecificElement() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement locaton = driver.findElement(By.xpath("//body/main[1]/section[3]/div[1]/h2[1]"));
			
			js.executeScript("arguments[0].scrollIntoView(true);", locaton);
			Thread.sleep(5000);
		}

		@AfterSuite
		public void closeChromeBrowser() {
			driver.quit();
		}
}

