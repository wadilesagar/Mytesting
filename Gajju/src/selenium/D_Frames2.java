package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Frames2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.manage().window().maximize();
		Thread.sleep(2000);
       	driver.switchTo().frame("frame1");
       	driver.findElement(By.xpath("/html/body/input")).sendKeys("FRAME PRACTICE");
       	Thread.sleep(2000);
       	driver.switchTo().frame("frame2");
       WebElement DropDown = driver.findElement(By.xpath("//select[@id='animals']"));
       DropDown.click();
      WebElement clickondropdown = driver.findElement(By.xpath("//option[@value='babycat']"));
      clickondropdown.click();
//		driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
//		driver.findElement(By.xpath("/html/body/input")).sendKeys("HELLO");
//		driver.findElement(By.xpath("//input[@id='a']")).click();
	}

}
