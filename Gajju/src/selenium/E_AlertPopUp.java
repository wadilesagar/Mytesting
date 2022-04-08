package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Clickon2ndPopup = driver.findElement(By.id("timerAlertButton"));
		Clickon2ndPopup.click();
		Thread.sleep(8000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		
//		WebElement clickMeButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		clickMeButton.click();
//		Thread.sleep(2000);
//	
//		Alert alt1 = driver.switchTo().alert();//3rd popup
//		String textOnAlertPopUp=alt.getText();//switch selenium focus to alert popup
//	    System.out.println("text on alert popup is"+textOnAlertPopUp);
//	    alt1.accept();  //clicking on ok button
	    
	    

	}

}
