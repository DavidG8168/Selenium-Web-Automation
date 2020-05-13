package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariAutomator {
	public static void main(String[] args) {
		// No need to set the system property on Mac.
		WebDriver driver = new SafariDriver();
		String baseURL = "http://google.com";
		driver.get(baseURL);
	}
}