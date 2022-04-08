package zerodhUsingPOMwithExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zerodhUsingPOM.kitehomePage;

public class kiteHomePage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	public kiteHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public void validateUserID(String Userid)
	{
		String expectedUserID = Userid;
		
		String actualUserID = userId.getText();
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID is matching TC is passed");
		}
		else {
			System.out.println("User ID is not matching TC is failed");
		}
		
					
	}
	
	public void clickOnLogoutButton(String logout) throws InterruptedException
	{
		userId.click();
		Thread.sleep(1000);
		logOutButton.click();
		
	}
}
