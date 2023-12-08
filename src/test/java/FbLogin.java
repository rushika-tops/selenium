import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbLogin {
	
		@Test
		public void  login( ) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		WebElement email =	driver.findElement(By.id("email"));
			email.sendKeys("Abc@gmail.com");
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("Abc");
	}

}
