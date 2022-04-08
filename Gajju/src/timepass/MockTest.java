package timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/tags/tag_iframe.asp");
		driver.switchTo().frame("iframe");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
	    driver.close();
	}

}
