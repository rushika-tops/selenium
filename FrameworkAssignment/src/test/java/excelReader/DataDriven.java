package excelReader;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataDriven {
	

		WebDriver driver;

		@BeforeClass
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		}
		

		@Test(dataProvider =   "dp")
		public void logintest(String email, String pass) throws InterruptedException {
			System.out.println(email + " " + pass);
			WebElement username = driver.findElement(By.id("email"));
			username.clear();
			username.sendKeys(email);
			WebElement password = driver.findElement(By.id("pass"));
			password.clear();
			password.sendKeys(pass);
			Thread.sleep(3000);

		}

		@Test
		@DataProvider(name = "dp")
		public static Object[][] data() {
			ExcelReader2 ex = new ExcelReader2("C:\\Users\\Kosht\\Desktop\\Excelreader.xlsx", "LoginData");
			int row = ex.rowCount();
			System.out.println("row : "+row);
			int col = ex.colCount();
			System.out.println("col : "+col);

			Object obj[][] = new Object[row-1][col];

			for (int i = 1;	 i < row; i++) {
				for (int j = 0; j < col; j++) {
					String data = ex.getData(i, j);
					System.out.println(data+" : "+i+" : "+j);
					obj[i - 1][j] = data;
				}
			}
			return obj;
		}
	}


