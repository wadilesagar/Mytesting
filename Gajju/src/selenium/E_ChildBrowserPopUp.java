package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//its give only one window
//		String mainpagewindowid=driver.getWindowHandle();
//		System.out.println("window is the "+mainpagewindowid);
		driver.findElement(By.name("NewWindow")).click();
		
		Thread.sleep(2000);
		//its give multiple windows
		Set<String> allwindowsID = driver.getWindowHandles();
        System.out.println("main window is "+allwindowsID);
        Iterator<String> it = allwindowsID.iterator();
           String mainpageId = it.next();
           String childpageId = it.next();
        //switch selenium focus to child window
           driver.switchTo().window(childpageId);
           driver.manage().window().maximize();
           driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("selenium");
           Thread.sleep(2000);
           
           driver.switchTo().window(mainpageId);
           driver.findElement(By.xpath("//input[@name='home']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//a[@href='signup']")).click();
           driver.findElement(By.name("uname")).sendKeys("sagar wadile");
           driver.findElement(By.id("email")).sendKeys("wadilesagar525");
           driver.findElement(By.id("tel")).sendKeys("12345678");
           Thread.sleep(2000);
           
          
           
	}

}
