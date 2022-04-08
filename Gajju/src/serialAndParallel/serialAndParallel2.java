package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialAndParallel2 {
  @Test
  public void YourMethod1() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.gajananmaharaj.org/");
      driver.manage().window().maximize();
   }
  @Test
  public void YourMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.sony.co.in/");
	    driver.manage().window().maximize();
  }
}
