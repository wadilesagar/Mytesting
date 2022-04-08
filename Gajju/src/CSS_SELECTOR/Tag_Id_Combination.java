package CSS_SELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Id_Combination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//COMBINATION OF TAG NAME & ID 
		driver.findElement(By.cssSelector("input#email")).sendKeys("sagar");
		
		//COMBINATION OF TAG NAME & ATTRIBUTE VALUE
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("123@gmail.com");
		
		//COMBINATION OF TAG NAME,CLASS,ATTRIBUTE VALUE
		driver.findElement(By.cssSelector("input.inputtext.[datatestid=royal_pass]")).sendKeys("gopal1234@gmail.com");
		
		
	}

}
