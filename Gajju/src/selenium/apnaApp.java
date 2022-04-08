package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class apnaApp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://employer.apna.co/login?whatsapp=true&utm_source=google&utm_medium=cpc&utm_campaign=IN_Search_Employer_Nagpur_Brand_Exact-vNov19&utm_adset={ad_group}&utm_keyword=apna%20hire%20app&utm_content={headline}&gclid=Cj0KCQiAjc2QBhDgARIsAMc3SqRRVwZgKfRBHjnxVledclhJMh5QWGcxt2nnYq5JJNTDSWxCq-eVRy8aAoipEALw_wcB");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("7249217053");
		Thread.sleep(2000);
		

		
	}

}
