package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSele {
	
//x.path

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

		   WebDriver driver =new ChromeDriver();
		   driver.get("http://student.cpuniversity.in/");
		   Thread.sleep(2000);
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   driver.findElement(By.className("//input[@title='Enter User Name']")).sendKeys("sagarwadile");
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sagar@123");
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	
	}

}
