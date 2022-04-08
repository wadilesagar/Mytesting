package selenium;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScrenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

		
		   WebDriver driver =new ChromeDriver();
			driver.get("https://vctcpune.com/");
			driver.manage().window().minimize();
			Thread.sleep(2000);

			 File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String randomvalue = RandomString.make(2);
			 File destination = new File("D:\\velocity\\abc"+randomvalue+".png");
	org.openqa.selenium.io.FileHandler.copy(sourse, destination);
			
			
	
	}

}
