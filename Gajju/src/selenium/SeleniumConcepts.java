package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcepts {
	
  public static void main(String[] args) throws InterruptedException 
     {
	    System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
              //INPUT TEXT
       WebElement InputName = driver.findElement(By.xpath("//input[@type='text']"));
       InputName.sendKeys("sagar wadile");
       WebElement InputEmail = driver.findElement(By.xpath("//input[@type='email']"));
       InputEmail.sendKeys("wadilesagar525");
       WebElement InputAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
       InputAddress.sendKeys("NANDURBAR");
       WebElement InputPerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
       InputPerAdd.sendKeys("NANDURBAR.MH");
       driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
   
       
     }
}
