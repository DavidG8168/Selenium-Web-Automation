package Profiles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class SetProfileFirefox {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		// Set custom profile.
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("AutomationProfiles");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);
		// Set up the driver and settings before the test.
		// Give the driver some profile.
		driver = new FirefoxDriver(options);
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		// Go to the site.
		driver.get(baseUrl);
		Thread.sleep(3);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		// Closes the browser.
		driver.close();
	}

}
