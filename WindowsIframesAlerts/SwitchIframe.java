package WindowsIframesAlerts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchIframe {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		baseURL = "http://letskodeit.teachable.com/pages/practice";
	}
	
	@Test
	public void test() throws Exception {
		driver.navigate().to(baseURL);
		// Switch to an iFrame - Basically a different window inside the current window.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name("iframe-name")));
		driver.switchTo().frame("iframe-name");
		// Now can interact with elements inside iFrame.
		WebElement elem = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/button"));
		elem.click();
		Thread.sleep(2000);
		// Switch back to parent frame.
		driver.switchTo().parentFrame();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
