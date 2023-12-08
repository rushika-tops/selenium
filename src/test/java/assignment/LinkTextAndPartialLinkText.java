package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkTextAndPartialLinkText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mysy.guj.nic.in/");

		// Find Element by Partiallink text :
		WebElement partiallink = driver.findElement(By.partialLinkText("Student"));
		partiallink.click();

		// Find Element by linkText :
		WebElement forgotpass = driver.findElement(By.linkText("Forgot Password"));
		forgotpass.click();

	}

}
