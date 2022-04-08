package handlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import timepass.WebElementMethods;

public class tableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='product']//th"));
		
        for(WebElement w:headers)
       {
          System.out.println(w.getText());	
       }
       List<WebElement> rows = driver.findElements(By.xpath("(//table[@id='product']//tr)[2]"));
       for(WebElement w:rows)
       {
    	   System.out.print("the rows are :"+w.getText());
    	   
       }
	}

}