package zerodhUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {

	
		
		@FindBy(id="pin") private WebElement pin;
		@FindBy(xpath="//button[@type='submit']") private WebElement  continueButton;
		
		public kitePinPage (WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		public void password()
		{
			pin.sendKeys("969696");
		}
		public void continueButton()
		{
			continueButton.click();
		}
	

}
