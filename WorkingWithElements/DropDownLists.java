package WorkingWithElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLists {
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
	public void test() throws InterruptedException {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		// By value tag.
		sel.selectByValue("benz");
		Thread.sleep(2000);
		// By index, starts from 1.
		sel.selectByIndex(2);
		Thread.sleep(2000);
		// By text visible in the list.
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		// Get all list options.
		List<WebElement> elems = sel.getOptions();
		// Get text from all the list options.
		for (int i = 0; i < elems.size(); i++) 
			System.out.println(elems.get(i).getText());		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
