package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/dragndrop/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(source, destination).perform();
		act.clickAndHold(source).moveToElement(destination).release().build().perform();
	}

}
