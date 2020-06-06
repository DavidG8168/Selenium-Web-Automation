package JavaScript;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution {
	WebDriver driver;
	// JS execution object.
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		// Cast web driver to JS executor.
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws Exception {
		// *********************** Basic.
		// Open the URL.
		js.executeScript("window.location = 'http://facebook.com/';");
		// Get the web element using JS, need to cast.
		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('email');");
		// Then can use the same as regular web element.
		textBox.sendKeys("Hello@gmail.com");
		// ************************ Window Size.
		long height = (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");
		System.out.println(height);
		System.out.println(width);
		// ************************ Scrolling Page - Not built in in Selenium, need JS.
		js.executeScript("window.location = 'https://en.wikipedia.org/wiki/Automation';");
		// Scroll down.
		js.executeScript("window.scrollBy(0,1920)");
		Thread.sleep(1000);
		// Scroll up.
		js.executeScript("window.scrollBy(0,-1920)");
		Thread.sleep(1000);
		// Scroll to element.
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/p[60]/a[3]"));
		// Send the element as an argument to the JS command.
		js.executeScript("arguments[0].scrollIntoView(true);", elem);
		// ************************* Clicking on element with JS - Use if regular click does not work.
		js.executeScript("arguments[0].click();", elem);
		

	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
}
