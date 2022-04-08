package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AwebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//URL
		Thread.sleep(2000);
//		System.out.println(driver.getTitle());   //SYSO-GET TITLE
//		System.out.println(driver.getCurrentUrl()); //SYSO GET URL
		
		String getCurrentURL = driver.getCurrentUrl(); //USING OBJECT GET CURRENT URL
		System.out.println("Get Current URL IS"+getCurrentURL);
		
		String getTitle = driver.getTitle();//USING OBJECT GET TITLE
		System.out.println("Get Title IS"+getTitle);
		
//		driver.get("https://www.gajananmaharaj.org/");
//		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
		
		driver.navigate().to("https://www.gajananmaharaj.org/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		/*
		 
		 */
	
	}

}
