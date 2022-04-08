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

public class ExplicitStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		WebElement SignInButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div[3]/div[2]/h6"));
		SignInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//WebDriverWait/ Explicit wait
		
		//1.create object of WebDriver wait pass driver and time unit as arguments
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(1000));
		
		//2. Using WebDriver wait Object call waiting method
		
		w.until(ExpectedConditions.visibilityOf(getOTPButton));
		getOTPButton.click();
		
		

	}

}
