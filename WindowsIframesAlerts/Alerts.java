package WindowsIframesAlerts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "http://letskodeit.teachable.com/pages/practice";
	}


	// JavaScript alerts.
	@Test
	public void test() throws Exception {
		driver.navigate().to(baseURL);
		// Create the alert.
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("David");
		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		Thread.sleep(1000);
		// Create Selenium class to accept alert.
		Alert alert = driver.switchTo().alert();
		// Accept the alert.
		alert.accept();
		// Decline the alert.
		// alert.dismiss();
	}

	@After
	public void tearDown() throws Exception {
	    Thread.sleep(3000);
	    // Closes all window handles.
	    driver.quit();
	}
}
