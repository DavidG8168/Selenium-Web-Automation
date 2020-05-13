package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXPATH {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://learn.letskodeit.com/p/practice");
		String text = driver.findElement(By.xpath("//td[contains(text(),'Python Programming Language')]//following-sibling::td")).getText();
		System.out.println("The value I found is: ".concat(text));
	}
}
