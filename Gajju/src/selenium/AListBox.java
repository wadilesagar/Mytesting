package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import handlingOfMultipleElements.selectingMultipleTextbox;

public class AListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		  WebElement s = driver.findElement(By.xpath("//div[@class='header-wrapper'][1]"));
		  s.click();
		  driver.findElement(By.id("item-0")).click();
		  Select s1 =new Select(s);
		  s1.selectByIndex(2);
		  
		
	}

}
