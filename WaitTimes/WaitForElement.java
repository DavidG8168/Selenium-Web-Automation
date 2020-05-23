package WaitTimes;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement {
	
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		// Maximize window.
		driver.manage().window().maximize();
		// Implicit Wait - Will attempt to get the DOM again if element not found within this timelimit.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Set base URL.
		baseURL = "http://google.com";
	}

	@Test
	public void test() {
		// Navigate to URL.
		driver.get(baseURL);
		// Explicit Wait - Wait for this specific element to become visible for 3 seconds.
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")));
		element.sendKeys("Hello There");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
