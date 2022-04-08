package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class getTextUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("Welcome To Practice Page")).getText());
		
//	WebElement WebEle = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
//	String Actualtext=WebEle.getText();
//	System.out.println("Text is "+Actualtext);
//	String Expectedtext="Welcome To Practice Page" ;
	
	WebElement WebEle1=driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	String Actualtext1 =WebEle1.getText();
	System.out.println("Text is "+Actualtext1);
	String Expectedtext1="Velocity Corporate Training Center";
	if(Actualtext1.equals(Expectedtext1))
	{
		System.out.println("text is matching TC is passed");
	}
	else
	{
		System.out.println("Text is not matching TC is failed");
	}
	}}
	
//	if(Actualtext.equals(Expectedtext))
//			{
//		System.out.println("Test is matching TC is passed");
//			}
//	else 
//	{
//		System.out.println("Test is not match TC is failed");
//	}
//	}


