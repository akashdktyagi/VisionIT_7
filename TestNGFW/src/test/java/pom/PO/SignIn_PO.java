package pom.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_PO
{

	private WebDriver driver;


	//page objects/webelements
	
	@FindBy(xpath="//*[@class='header_user_info']")
	WebElement logIn;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	
	 @FindBy(xpath="//button[@id='SubmitLogin']")
	    WebElement btn1Signin;
	    

    	public SignIn_PO(WebDriver driver) 
    	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	    }




	//Action
    	
    	
    
    	
    	public void firstSigninButton()
    	{
    		logIn.click();
    	}
    	
    	
    	public void emailAdrress()
    	{
    		email.sendKeys("123distamt@gail.com");
    	}
    	
    	public void passwordFiller()
    	{
    		password.sendKeys("amt@123");;
    	}
    
    	public void secondSigninButton()
    	{
    		password.click();
    	}


	
	
}
