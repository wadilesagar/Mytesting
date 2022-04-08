package waitOrSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("12345");
		driver.findElement(By.id("passContainer")).sendKeys("12344567");
		WebElement loginButton = driver.findElement(By.id("u_0_d_D1"));
		
		loginButton.click();
		WebDriverWait w =new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(loginButton));
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait
		//.withTimeout(Duration.ofMillis(1000));
		//.polli
	}

}
