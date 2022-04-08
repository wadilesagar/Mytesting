package zerodhUsingPOMwithExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {

	@FindBy() private WebElement pin;
	@FindBy() private WebElement continueButton;
	
	public kitePinPage (WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public void enterpin(String Pin)
	{
		pin.sendKeys(Pin);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
		
	}
	
}
