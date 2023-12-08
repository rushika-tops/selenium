package assignment;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalHyperlink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List <WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Hyperlinks of the page : "  +  hyperlinks.size());
		for (WebElement alllink : hyperlinks) {
			System.out.println(alllink.getText()+  " - " + alllink.getAttribute("href"));
		}
}
}
