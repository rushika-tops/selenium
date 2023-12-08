package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,550)");

		WebElement dropdown = driver.findElement(By.name("country"));

		Select s = new Select(dropdown);

		boolean result = s.isMultiple();
		System.out.println(result);
		s.selectByIndex(2);

	}
}
