package WorkingWithElements;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://google.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		WebElement e = driver.findElement(By.xpath("//*[@id='tophf']/input[3]"));
		// Check if element is disabled.
		if (!e.isEnabled())
			System.out.println("Input is disabled.");
		driver.navigate().to("https://davidg8168.github.io/Visible-Invisible-On-Click/");
		WebElement paragraph = driver.findElement(By.cssSelector(".MyParagraphClass"));
		Thread.sleep(2000);
		if (paragraph.isDisplayed())
			System.out.println("Not hidden");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
