package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropDown);
        Thread.sleep(1000);
        s.deselectByVisibleText("select1");
        s.selectByIndex(2);
       
	}

}
