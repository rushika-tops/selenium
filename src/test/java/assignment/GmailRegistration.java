package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailRegistration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		 WebElement createaccountbtn = driver.findElement(By.xpath("//span[text() ='Create account']"));
	        createaccountbtn.click();
	        WebElement info = driver.findElement(By.xpath("//span[text() ='For my personal use']"));
	        info.click();
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("nivedita");
        WebElement nextbtn = driver.findElement(By.xpath("//span[text() ='Next']"));
        nextbtn.click();
       // Thread.sleep(2000);
       // WebElement mo = driver.findElement(By.id("month"));
        
     // Select months = new Select(mo);
      // months.selectByVisibleText("April");
       WebElement day = driver.findElement(By.xpath(" //input[@id='day']"));
       day.sendKeys("04");
       WebElement yr = driver.findElement(By.id("year"));
         yr.sendKeys("2004");
        
	}
}

