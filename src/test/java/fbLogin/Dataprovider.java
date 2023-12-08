package fbLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	@Test(dataProvider =  "dp")
	public void  login(String email,String pass ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pass);
}
	
	@Test
	@DataProvider(name="dp")
	
		public  Object[][] loginData() {
			Object[][] obj = new Object[4][2];
					

			obj[0][0] = "correct@gmail.com";
			obj[0][1] = "correct password";
			
			obj[1][0] = "incorrect@gmail.com";
			obj[1][1] = "incorrect password";
			
			obj[2][0] = "incorrect@gmail.com";
			obj[2][1] = "incorrect password";
			
			obj[3][0] = "incorrect@gmail.com";
			obj[3][1] = "incorrect password";
			
			
			return obj;
		}
	}



