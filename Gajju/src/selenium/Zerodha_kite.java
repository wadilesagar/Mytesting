package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_kite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("userid")).sendKeys("sagarwadile");
//		Thread.sleep(2000);
//     	driver.findElement(By.id("password")).sendKeys("12345");
//     	
//		driver.findElement(By.tagName("button")).click();
//		
//		driver.findElement(By.name("email"));
//		driver.findElement(By.id("userid")).sendKeys("2345");
//		driver.findElement(By.name("email")).sendKeys("sagar");
		
	
	
		WebElement UserName = driver.findElement(By.name("email"));
		
		UserName.sendKeys("saraj");
		UserName.clear();
		Thread.sleep(2000);
		UserName.sendKeys("sami");
		
	WebElement password =driver.findElement(By.id("pass"));
	 
	password.sendKeys("1234");
	password.clear();
	Thread.sleep(2000);
	password.sendKeys("5678");
	}

}
