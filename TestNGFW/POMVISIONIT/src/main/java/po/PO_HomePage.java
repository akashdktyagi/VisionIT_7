package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PO_HomePage {

	WebDriver driver;
	public PO_HomePage(WebDriver d)
	{
		
		this.driver=d;
		
	}	
	
	@FindBy(how = How.XPATH, using="//html//body//div[2]//div[4]//div[1]//div//div//div[3]//div//div[1]//a//i[2]")
	WebElement btn_My_Account;
	//@FindBy(how = How.XPATH, using="//a[@title='Sign in']")
	//WebElement btn_Sign_In;
	
	
	public void ClickOnMy_Account() {
		
		btn_My_Account.click();
		//btn_Sign_In.click();
		
		//String pageTitleActual = driver.getTitle();
		//String pagerTitleExpected = "Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		//Assert.assertEquals(pageTitleActual, pagerTitleExpected,"page is not able to navigate to Sign In page after Click");
		
	}
}
