package waitOrSynchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	   //to check changes in selenium--go to selenium dev website and check documentation 
	   //this method is not using now driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
		driver.findElement(By.id("alertButton")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   // driver.close();
	}

}
