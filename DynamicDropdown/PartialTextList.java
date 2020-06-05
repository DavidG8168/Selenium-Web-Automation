package DynamicDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Find an element in a dynamically changing suggestion list.
public class PartialTextList {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		// Define the driver.
		driver = new ChromeDriver();
		// Manage the properties. Maximize window and set implicit wait to 10 seconds.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Set base URL.
		baseURL = "https://www.goibibo.com/";
	}

	
	@Test
	public void test() throws Exception {
		// Go to the URL.
		driver.navigate().to(baseURL);
		// Find the auto-complete text box.
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]")).sendKeys("london");
		// Find the auto-complete suggestion list.
		WebElement elem = driver.findElement(By.id("react-autosuggest-1"));
		// Get the innerHTML of that sublist.
		String ulElement = elem.getAttribute("innerHTML");
		// Print it.
		System.out.println(ulElement);
		// Collect all li elements into a list.
		List<WebElement> elemList = elem.findElements(By.tagName("li"));
		// Click the 4th option.
		WebElement option4 = elemList.get(3);
		Thread.sleep(2000);
		option4.click();
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}


}
