package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCSS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://learn.letskodeit.com/p/practice");
		// tag#id
		driver.findElement(By.cssSelector("input#hondaradio")).click();
		// tag[attribute(wildcard)='value']
		driver.findElement(By.cssSelector("input[name^='enter-name']")).sendKeys("David");
		// tag>.classOfChildTag
		driver.findElement(By.cssSelector("fieldset>.btn-style")).click();
	}
}
