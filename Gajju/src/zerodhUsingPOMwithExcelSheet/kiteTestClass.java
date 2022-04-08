package zerodhUsingPOMwithExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zerodhUsingPOM.kitehomePage;

public class kiteTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream MyFile=new FileInputStream("D:\\excel\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("sheet1"); 
		
		System.setProperty("webdriver.chrome.driver", "D:\\a\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
      kiteLoginPage kl=new kiteLoginPage(driver);
     
      kl.enterUserID(Mysheet.getRow(0).getCell(0).getStringCellValue());
      kl.enterpassword("pass");
      kl.loginButton("logIn");
      Thread.sleep(1000);
      
      kitePinPage kp=new kitePinPage(driver);
      kp.enterpin("Pin");
      kp.clickOnContinueButton();
      Thread.sleep(1000);
      
      kitehomePage kh=new kitehomePage(driver);
      kh.validateUserID("userid");
      kh.clickonLogoutButton();
      
	}

}
