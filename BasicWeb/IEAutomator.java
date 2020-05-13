package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEAutomator {
	public static void main(String[] args) {
		// Set GeckoDriver.
		System.setProperty("webdriver.ie.driver", "C:\\Users\\David\\Downloads\\Automation Dev Course\\ExplorerDriver\\IEDriverServer.exe");
		/* ZOOM LEVEL SHOULD BE 100%
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(caps);
		 */
		// Initialize driver.
		WebDriver driver = new InternetExplorerDriver();
		// Set baseURL and open it.
		String baseURL = "http://google.com";
		driver.get(baseURL);
		// Locate and type text into search box.
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello World");
		// Locate and click on the search button.
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	}
}
