package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_pathText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

		   WebDriver driver =new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   
//		   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sagar");
//		   Thread.sleep(2000);
//		   
//		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sagar@123");
//		   Thread.sleep(2000);
//		   
//		   driver.findElement(By.xpath("//button[@type='submit']")).click();
//		   Thread.sleep(2000);
		   
//		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//h2[text()='Top Deals On Fashion']"));
		   Thread.sleep(2000);
		   

		   
		   
		   
	}

}
