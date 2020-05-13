package BasicWeb;

import org.openqa.selenium.By;
// Imports from Selenium.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.opera.OperaDriver;


public class BasicDefinitions {
	// Create a Chrome driver.
	WebDriver chromeDriver = new ChromeDriver();
	// Create a FireFox driver.
	WebDriver fireFoxDriver = new FirefoxDriver();
	// Create a Edge driver.
	WebDriver edgeDriver = new EdgeDriver();
	// Create a Internet Explorer driver.
	WebDriver explorerDriver = new InternetExplorerDriver();
	// Create a Safari driver.
	WebDriver safariDriver = new SafariDriver();
	// Create a Opera driver.
	WebDriver operaDriver = new OperaDriver();
	// Create a web element, locate by ID.
	WebElement element = chromeDriver.findElement(By.id("UniqueID"));
}
