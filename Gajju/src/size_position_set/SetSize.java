package size_position_set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		System.out.println(driver.manage().window().getSize());
		Dimension defaultsize = driver.manage().window().getSize();
		Dimension d=new Dimension(200, 200);
		
		driver.manage().window().setSize(d);
		
	}

}
