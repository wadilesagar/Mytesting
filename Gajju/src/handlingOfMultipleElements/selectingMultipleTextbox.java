package handlingOfMultipleElements;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectingMultipleTextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> totalCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("total checkboxes "+totalCheckbox.size());
		
	for(WebElement w:totalCheckbox)
	{
         w.click();
         Thread.sleep(2000);
	}
	for(WebElement w:totalCheckbox)
	{
		w.click();
		Thread.sleep(2000);
	}
	}

}
