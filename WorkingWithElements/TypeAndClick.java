package WorkingWithElements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeAndClick {
	
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		// Set up the driver and settings before the test.
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		// Go to the site, click login, write email and password and click.
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[2]/a")).click();
		WebElement email = driver.findElement(By.xpath("//*[@id='user_email']"));
		email.clear();
		email.sendKeys("fakeMail@gmail.com");
		WebElement password = driver.findElement(By.name("user[password]"));
		password.clear();
		password.sendKeys("12345678");
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-md.login-button")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		// Closes the browser.
		driver.close();
	}

}
