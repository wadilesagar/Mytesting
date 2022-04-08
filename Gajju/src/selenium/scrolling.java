package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
    	WebElement CheckBoxButton1 = driver.findElement(By.id("checkBoxOption1"));
	
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0]. scrollIntoView();",CheckBoxButton1);
		Thread.sleep(3000);
        CheckBoxButton1.click();
        

	

	}

}
