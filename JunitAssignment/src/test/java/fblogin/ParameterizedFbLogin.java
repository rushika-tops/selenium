package fblogin;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class ParameterizedFbLogin {
	String Email;
	String Password;
	public ParameterizedFbLogin(String email,String password) {
		this.Email= email;
		this.Password = password;
	}
		
		WebDriver driver = null;
		@Before
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		}

		@Test
		public void logIn() {
    	WebElement emailfield =	driver.findElement(By.id("email"));
		emailfield.sendKeys(Email);
		WebElement passwordfield=driver.findElement(By.id("pass"));
		passwordfield.sendKeys(Password);
			
		}
		@Parameters
		public static List<Object[]> loginData(){
			Object[][] obj = new Object[4] [4];
			obj[0][0] = "incorrect@gmail.com";
			obj[1][0] = "incorrect";

			obj[0][1] = "incorrect@gmail.com";
			obj[1][1] = "correct";

			obj[0][2] = "correct@gmail.com";
			obj[1][2] = "incorrect";

			obj[0][3] = "correct@gmail.com";
			obj[1][3] = "correct";

			return Arrays.asList(obj);
		}
		}
			
			
		
		
		
		
		
		
	


