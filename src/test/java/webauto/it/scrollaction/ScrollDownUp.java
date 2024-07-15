package webauto.it.scrollaction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownUp {
	

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
			js.executeScript("window.scrollTo(0,0)");
			Thread.sleep(5000);
		}

		@AfterSuite
		public void closeChromeBrowser() {
			driver.quit();
		}
}

