package WorkingWithElements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesRadioButtons {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		// Radio button - only one can be clicked.
		// Checbox - can have multiple.
		WebElement bmw = driver.findElement(By.id("bmwradio"));
		bmw.click();
		if (bmw.isSelected())
			System.out.println("BMW is selected.");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
