package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Actions act=new Actions(driver);
		act.click(day).perform();
		for(int i=0;i<14;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
        for(int i=0;i<=19;i++)
        {
        	act.sendKeys(Keys.UP).perform();
        }
          WebElement fn = driver.findElement(By.name("firstname"));
		act.click(fn).keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();
      
	}

}
