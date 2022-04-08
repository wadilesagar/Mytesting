package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserCT {

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\a\\firefoxjar\\geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://github.com/mozilla/geckodriver/releases");
	

}
}
