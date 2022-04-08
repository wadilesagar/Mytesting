package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_webElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//URL
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(By.id("email")).sendKeys("Sagar & Gopal");//by using id
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sagar & Gopal");//by using xpath
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Sagar & Gopal");
		email.clear();
		email.sendKeys("RAM LAKHAN");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("SAGARGOPAL");
		password.clear();
		password.sendKeys("SAGOPA");
//		driver.quit();
		
	    System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you ')]")).getText());
	    
//		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
	}

}
