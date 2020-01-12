package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PO_LoginPage_AT 
{
	WebDriver driver;
	
	public PO_LoginPage_AT(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	@FindBy(how = How.ID, using ="email")WebElement txtBox_usrname;
	@FindBy(how = How.ID, using ="passwd")WebElement txtBox_pass;
	@FindBy(how = How.ID, using ="SubmitLogin")WebElement btn_login;
	
	//methods
	private void SetUsername(String arg) 
	{
		txtBox_usrname.sendKeys(arg);
	}
	private void SetPassword(String arg) 
	{
		txtBox_pass.sendKeys(arg);
	}
	private void ClickSignInButton() 
	{
		btn_login.click();
	}
	public void login_into_Ecom(String u, String p)
	{
		SetUsername(u);
		SetPassword(p);
		ClickSignInButton();
		
		String pageTitleExpected = "My account - My Store";
		String pageTitleActual = driver.getTitle();
		Assert.assertEquals(pageTitleExpected, pageTitleActual,"Login is not Succesfull with Username as:" 
		+ u + "Password :" + p);
	}
}
