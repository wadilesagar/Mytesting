package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialAndParallel1 {
  @Test
  public void MyMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();

  }
  @Test
  public void MyMethod2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://ww.google.com/");
	    driver.manage().window().maximize();
	    
  }
 
}
