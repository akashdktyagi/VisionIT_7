package po;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PO_Homepage_AT 
{
// Initialization
	
	WebDriver driver;

	public PO_Homepage_AT(WebDriver d) 
	{
		this.driver = d;
	} 	
//Locators
	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	WebElement btn_signin;
	
//Methods
	public void ClickonSignInButton() 
	{
		btn_signin.click();
		String pageTitleActual = driver.getTitle();
		String pageTitleExpected = "Login - My Store";
		Assert.assertEquals(pageTitleActual, pageTitleExpected, "Page is not able to navigate");
	}
	
}
