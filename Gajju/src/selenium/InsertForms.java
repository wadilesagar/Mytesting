package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertForms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement InsertFormsInfo = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		InsertFormsInfo.sendKeys("SAGAR");
		InsertFormsInfo.sendKeys("WADILE");
        InsertFormsInfo.sendKeys("(//input[@autocomplete='off'])[1]");
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("123456789");
	    driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("01/02/0000");
	    driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[1]")).sendKeys("HELLO VELOCITY");
	}

}
