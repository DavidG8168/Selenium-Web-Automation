package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomator {
	public static void main(String[] args) {
		// Set GeckoDriver.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\David\\Downloads\\Automation Dev Course\\GeckoDriver\\geckodriver.exe");
		// Initialize driver.
		WebDriver driver = new FirefoxDriver();
		// Set baseURL and open it.
		String baseURL = "http://google.com";
		driver.get(baseURL);
		// Locate and type text into search box.
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello World");
		// Locate and click on the search button.
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
	}
}
