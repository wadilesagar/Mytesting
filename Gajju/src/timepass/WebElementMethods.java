package timepass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
	    driver.findElement(By.id("item-0")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sagar");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123@gmail.com");
	    driver.findElement(By.xpath("(//textarea[@rows='5'])[1]")).sendKeys("hello velocity GOOD Morning");
	    driver.findElement(By.id("permanentAddress")).sendKeys("nandurbar shahada bypass road nandurbar");
	}

}
