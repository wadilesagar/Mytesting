package practice;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://web.whatsapp.com/");
    
     File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     System.out.println(Source);
     File dest=new File("C:\\Users\\Dell\\Documents\\WHATSAPP SCREENSHOT.png");
    org.openqa.selenium.io.FileHandler.copy(Source, dest);
    }
}
