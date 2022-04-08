package size_position_set;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
	
		
		System.out.println(driver.manage().window().getPosition());
		//1.
		Point p=new Point(6, 10);
		//2.
		driver.manage().window().setPosition(p);
	}

}
