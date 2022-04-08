package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.switchTo().frame("iframeResult");
		
//		WebElement ClickMeButton = driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time')]"));
//	    ClickMeButton.click();
//	    Thread.sleep(2000);
//	    driver.switchTo().defaultContent();
//	    driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	    
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");
		
       driver.findElement(By.xpath("//iframe[@id='courses-iframe']")).click();
	}

}
