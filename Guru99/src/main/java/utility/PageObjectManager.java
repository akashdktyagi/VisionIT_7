package utility;

import org.openqa.selenium.support.PageFactory;

import baseSetup.TestBase;
import pages.LoginPO;
import pages.NewCustomerPage;


public class PageObjectManager extends TestBase {
	
	private static LoginPO loginpage;
	private static NewCustomerPage customerPage;
	
	
	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	
	public static LoginPO getloginpage()
	{
		
		return (loginpage==null)? new LoginPO():loginpage;
		
	}
	
	public static NewCustomerPage getCustmerPage()
	{
		return (customerPage==null)? new NewCustomerPage():customerPage;
		
		
	}
	
	
	
	

}
