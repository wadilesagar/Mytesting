package timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
   public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=PquZBLuFmwA");
		driver.manage().window().maximize();
		
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium parctice");
        Thread.sleep(2000);
        
		driver.findElement(By.id("search"));
		driver.findElement(By.id("container")).sendKeys("hindi movies");
		driver.findElement(By.id("search-icon-legacy")).click();
}
}
