package firstSELENIUMSTUDY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("WebDriver.Chrome.Driver", "F:\\SELE\\Chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label=\"Mobile Number or Email\"]")).sendKeys("123456");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label=\"Full Name\"]")).sendKeys("sagar wadile");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@aria-label=\"Username\"]")).sendKeys("sagar@123");
	Thread.sleep(2000);
	


	
	}

}
