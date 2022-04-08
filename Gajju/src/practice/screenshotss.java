package practice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotss {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gajananmaharaj.org/");
    driver.manage().window().maximize();
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	File dest=new File("C:\\Users\\Dell\\Documents\\WHATSAPP SCREENSHOT.png");
	
	FileHandler.copy(source, dest);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyy_MM_dd HH.mm.ss");
	Date date = new Date(5);
	String dateofsystem= sdf.format(date);
	System.out.println(dateofsystem);
	System.out.println(date);
	
}
}
