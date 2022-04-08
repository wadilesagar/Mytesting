package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://licindia.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='active']")).click();
		driver.findElement(By.xpath("//a[text()='Investor Relations ']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jeevan bima nigam");
	
        
        driver.findElement(By.xpath("//font [@style='vertical-align: inherit;']")).click();
	}

}
