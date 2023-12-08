package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kosht\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
        customerId.sendKeys("12345");
        WebElement submitbtn = driver.findElement(By.name("submit"));
        submitbtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        
        
        
        

}
}
