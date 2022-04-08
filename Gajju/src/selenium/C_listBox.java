package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_listBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(11);
		
		/*driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='card-up'])[1]")).click();
		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='header-text'])[1]")).click();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
//		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		WebElement dropDown = driver.findElement(By.xpath("//option[@value='option1']"));
		dropDown.click();
        Select s=new Select(dropDown);
        s.selectByValue("option2");
        s.selectByVisibleText("Option2");*/
        
       
	}

}
