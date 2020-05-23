package Profiles;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetProfileChrome {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		// Create options for extension and pass to driver.
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\David\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aapocclcgogkmnckokdopfmhonfmgoek\\0.10_0.crx"));
		// Set up the driver and settings before the test.
		// Will bring up chrome with that extension.
		driver = new ChromeDriver(options);
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3);
	}
	
	@After
	public void tearDown() throws Exception {
		// Closes the browser.
		driver.close();
	}

}
