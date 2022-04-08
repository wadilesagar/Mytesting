package testNGstudys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	        @Parameters("browserName")
			@Test
		  public void CrossBrowser(String browserName) throws InterruptedException 
		 {
			 WebDriver driver=null;
			 
			 if(browserName.equals("chrome"))
			 {
				 System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			 }
			 
			 else if (browserName.equals("firefox"))
			 {
				 System.setProperty("webdriver.gecko.driver", "D:\\a\\firefoxjar\\geckodriver.exe");
				 driver= new FirefoxDriver();
			}
		  
			 driver.get("https://vctcpune.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
		 }
}
