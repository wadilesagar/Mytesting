package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ClickMeButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.click();//1st type
		act.click(ClickMeButton).click().build().perform();//2nd type
		

		Alert alt = driver.switchTo().alert();
		alt.accept();
		
	}

}
