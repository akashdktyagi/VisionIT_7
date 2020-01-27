package pom.TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.PO.SignIn_PO;

public class SignIn_TC
{

	WebDriver driver;
	SignIn_PO singnInPO_Obj;
	
	

	@BeforeMethod
	public void setup()
	{
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		singnInPO_Obj= new SignIn_PO(driver);
	}
	
	@Test(priority=1)
	public void signIn()
	{
		
		singnInPO_Obj.firstSigninButton();
		singnInPO_Obj.emailAdrress();
		singnInPO_Obj.passwordFiller();
		singnInPO_Obj.secondSigninButton();
		
	}
	
	
	
	
			    
	
		    
	
	 
	   @AfterMethod()
	   public void closeBrowserWin()
	   {
		   driver.close();
	   }
	
}
