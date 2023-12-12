package fblogin;




import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin{
	static WebDriver driver=null;
	
	@BeforeClass
	public static  void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	}

	@Test
	public void  logIn(){
	
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("abc@123");
		

}
	}
