package zerodhUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage {
    //1)variable declaration
	@FindBy(id="userid") private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	
	//2)constructor
	
	public kiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3)methods                             HD5857	Ajinkya@123	969696 zerodha id password pin
	public void sendUserID()
	{
		userID.sendKeys("HD5857");
	}
	public void password()

	{
		password.sendKeys("Ajinkya@123");
	}
	public void loginButton()
	{
		loginButton.click();
	}
}
