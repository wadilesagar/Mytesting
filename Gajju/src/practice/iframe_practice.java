package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import handlingOfMultipleElements.selectingMultipleTextbox;

public class iframe_practice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
     
        driver.switchTo().defaultContent();
        driver.findElement(By.id("menuButton")).click();
	}

}
