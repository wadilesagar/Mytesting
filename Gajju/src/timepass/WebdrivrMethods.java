package timepass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdrivrMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.lalbaugcharaja.com/en/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);   
	    driver.navigate().back();
	    Thread.sleep(2000);   
	    driver.navigate().forward();
	    Thread.sleep(2000); 
        driver.navigate().refresh();
	    Thread.sleep(2000); 
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    driver.quit();
	   
	}

}
