package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	public static void main(String[] args) throws InterruptedException {
		// Initialize driver, no properties as driver.exe added to system path.
		WebDriver driver = new ChromeDriver();
		// Maximize the window.
		driver.manage().window().maximize();
		// Wait 3 seconds for elements to appear if they are not immediately found.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to the site.
		driver.get("http://learn.letskodeit.com");
		// XPATH.
		// Click the login button to move to that page.
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
		// Type some email in the text box.
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("MyEmail@gmail.com");
		// Save the button element.
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/input"));
		// Click on it.
		loginButton.click();
		driver.get("http://learn.letskodeit.com/p/practice");
		// NAME.
		driver.findElement(By.name("enter-name")).sendKeys("Sent the keys");
		driver.get("http://letskodeit.teachable.com");
		// LINK TEXT AND PARTIAL LINK TEXT.
		driver.findElement(By.linkText("Enroll now")).click();
		Thread.sleep(2000);
		// Go back.
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Enroll")).click();
		// CLASS.
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("fake@gmail.com");
		// TAG NAME.
		driver.findElement(By.tagName("button")).click();
	
	}

}
