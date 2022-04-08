package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import timepass.WebElementMethods;

public class handlingOfMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println(totalLinks.size());
		
		for(WebElement w:totalLinks)
		{
			System.out.println(w.getText());
		}
		
	}

}