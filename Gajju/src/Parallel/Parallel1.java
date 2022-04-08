package Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
  @Test
  public void MyMethod1() 
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
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.sony.co.in/");
  }
}
