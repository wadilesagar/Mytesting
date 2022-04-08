package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

		   WebDriver driver =new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@type=\"hidden\"]")).sendKeys("SAGAR");
		   driver.findElement(By.xpath("//input[@type=\"hidden\"]")).sendKeys("wadile");
		   Thread.sleep(2000);
		   
driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
Thread.sleep(2000);
	     
	}

}
