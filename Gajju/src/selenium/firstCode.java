package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstCode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
//	Thread.sleep(2000);
//		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	Thread.sleep(2000);
	
//	   driver.manage().window().minimize();
//    Thread.sleep(2000);

    driver.findElement(By.xpath("//input[@type='radio']")).click();
    Thread.sleep(2000);
//    
//    driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
//    driver.findElement(By.xpath("//option[@value='option1']")).click();
//    driver.findElement(By.xpath("//legend[text()='Checkbox Example']")).click();
//    driver.findElement(By.xpath("//button[@id='openwindow']")).click();
    
    driver.findElement(By.xpath("//a[contains(text(),'Corporate Training Center')]")).click();
    
    driver.findElement(By.xpath("(//input[(@name='radio')])[4]")).click();
    
    driver.findElement(By.xpath("(//input[(@type='checkbox')])[3]")).click();
    driver.findElement(By.xpath("(//h1[contains(text(),' ')])[1]")).click();
    

	}}
