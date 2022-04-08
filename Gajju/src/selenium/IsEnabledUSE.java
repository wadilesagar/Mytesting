package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUSE {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		SignInButton.click();
		Thread.sleep(2000);
		
		

	}

}
