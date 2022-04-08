package zerodhUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userIDField = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
         kiteLoginPage login =new kiteLoginPage(driver);
         login.sendUserID();
         login.password();
         login.loginButton();
         Thread.sleep(1000);
         
         kitePinPage pin=new kitePinPage(driver);
         pin.password();
         pin.continueButton();
         Thread.sleep(1000);
         
         kitehomePage homepage=new kitehomePage(driver);
         homepage.userIDValidate();
         homepage.clickonLogoutButton();
         driver.close();
    
	}

}
