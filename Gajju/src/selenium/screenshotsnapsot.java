package selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class screenshotsnapsot {
			public static void main(String[] args) throws IOException, InterruptedException {
				
			System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");

		    WebDriver driver =new ChromeDriver();
			driver.get("https://vctcpune.com/");
			driver.manage().window().minimize();
			Thread.sleep(1000);
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String randomvalue = RandomString.make(2);
			File destination = new File("D:\\velocity\\abc"+randomvalue+".png");
		    FileHandler.copy(source, destination);
		
		}

		}
	