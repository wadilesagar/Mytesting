import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerodhawithDDF {//data driven framework

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		userID.sendKeys("DAA677");
		password.sendKeys("Velocity@123");
		login.click();
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("866918");
		continueButton.click();
		Thread.sleep(1000);
		
		WebElement userID1 = driver.findElement(By.xpath("//span[@class='user-id']"));
        String actualUserID = userID1.getText();
        String expectedUserID = "DAA677";
        
        if(actualUserID.equals(expectedUserID))
        {
        	System.out.println("user ID pass TC matching");
        }
        else
        {
        	System.out.println("user ID not match TC failed");
        }
        userID1.click();
        
        WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
        logout.click();
        driver.close();
	}

}
