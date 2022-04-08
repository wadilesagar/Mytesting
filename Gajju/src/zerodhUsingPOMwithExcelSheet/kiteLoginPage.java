package zerodhUsingPOMwithExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage {
  @FindBy(id="userid") private WebElement userID;
  @FindBy(id="password") private WebElement password;
  @FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
  
  public kiteLoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void enterUserID(String uID)
  {
	  userID.sendKeys(uID);
  }
  public void enterpassword(String pass)
  {
	  password.sendKeys(pass);
  }
  public void loginButton(String login)
  {
	  loginButton.click();
  }
  
}
