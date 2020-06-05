package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakePageScreenshots {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		// Create ChromeDriver.
		driver = new ChromeDriver();
		// Maximize window and set timeout to 10 seconds.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// baseURL.
		baseURL = "https://facebook.com/";
	}

	@Test
	public void test() {
		// Goto URL.
		driver.navigate().to(baseURL);
		// Create Screenshot object.
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		// Take screenshot.
		 File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
	        // Create destination for screenshot to be saved.
	        File DestFile = new File(System.getProperty("user.dir").concat("\\images\\image.jpg"));
	        //Copy file to destination.
	        try {
	        	// This is from the Apache Commons IO dependency.
	            FileUtils.copyFile(SrcFile, DestFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("Could not save file screenshot.");
	        }
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
