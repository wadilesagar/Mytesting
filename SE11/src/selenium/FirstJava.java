package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJava {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.Driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='text']"));
	}

}
