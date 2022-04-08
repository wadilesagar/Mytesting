package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		System.out.println(alloptions.size());
		for(WebElement w:alloptions)
		{
			String actualResult = w.getText();
			System.out.println(w.getText());
			String expectedResult ="honda amaze";
			Thread.sleep(2000);
			
			if(actualResult.equals(expectedResult))
			{
			
				w.click();
				break;
			}
		}
			Thread.sleep(2000);
			driver.findElement(By.linkText("Images")).click();
			
		}
               
	}


