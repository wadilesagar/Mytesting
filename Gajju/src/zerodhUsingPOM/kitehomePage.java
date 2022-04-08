package zerodhUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomePage {

	
		
		@FindBy(xpath="//span[@class='user-id']") private WebElement userIDValidate;
        @FindBy(xpath="//a[@target='_self']") private WebElement logoutButton;
        
        public kitehomePage (WebDriver driver)
        {
        	PageFactory.initElements(driver, this);
        }
        public void userIDValidate ()
        {
        	String actualUserID=userIDValidate.getText();
        	String expectedUserID="HD5857";
        	
        	if(actualUserID.equals(expectedUserID))
        	{
        		System.out.println("user id match TC passed");
        	}
        	else
        	{
        		System.out.println("user id not match TC failed ");
        	}
        	
        }
        public void clickonLogoutButton() throws InterruptedException
        {
        	userIDValidate.click();
        	Thread.sleep(1000);
        	logoutButton.click();
        }
		public void validateUserID(String string) {
			// TODO Auto-generated method stub
			
		}
		
       
        

}
