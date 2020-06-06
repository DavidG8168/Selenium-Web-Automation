package WindowsIframesAlerts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "http://letskodeit.teachable.com/pages/practice";
	}



	@Test
	public void test() throws Exception {
		driver.navigate().to(baseURL);
		// Get parent handle.
		String parentHandle = driver.getWindowHandle();
		// Click to open new window.
		driver.findElement(By.id("openwindow")).click();
		// Get all other new window handles.
		Set<String> handles = driver.getWindowHandles();
		// Iterate the handles.
		for (String handle:handles) {
			System.out.println(handle);
			// Switch to next handle if not the parent handle.
			if(!handle.equals(parentHandle)) {
				// Switch to next handle.
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"search-courses\"]")).sendKeys("Python");
				// Closes only the current window.
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		// Switch to parent after finishing with all other windows.
		driver.switchTo().window(parentHandle);
	}

	@After
	public void tearDown() throws Exception {
	    Thread.sleep(3000);
	    // Closes all window handles.
	    driver.quit();
	}
}
