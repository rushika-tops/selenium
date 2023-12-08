import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedLogin {
	@Parameters({"Email","Password"})
	@Test
	public void  login(String email,String password ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement emailfield =	driver.findElement(By.id("email"));
		emailfield.sendKeys(email);
		WebElement passwordfield=driver.findElement(By.id("pass"));
		passwordfield.sendKeys(password);
}


}
