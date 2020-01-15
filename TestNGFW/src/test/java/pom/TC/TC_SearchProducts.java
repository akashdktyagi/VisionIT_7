package pom.TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.PO.PO_Search;

public class TC_SearchProducts
{

	WebDriver driver;
	PO_Search PO_Obj;
	
	

	@BeforeMethod
	public void setup()
	{
		
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();

		PO_Obj= new PO_Search(driver);
	}
	
	@Test(priority=1)
	public void signIn()
	{
		PO_Obj.clickOnMyAccount();
		PO_Obj.clickOnSignin();
		PO_Obj.clickOnSignPopup();
	}
	
	@Test
	public void searchProductWithKey()
	{
		
			PO_Obj.enterproductKey("Mobile");
			PO_Obj.clickonsecrhButton();
			
	}
	
	
	@Test
	public void addProductToCart()
	{
		
			    PO_Obj.enterproductKey("Mobile");
			    PO_Obj.clickonsecrhButton();
			    PO_Obj.clickonProduct();
			    PO_Obj.AddItemToCart();
				//Assert.assertEquals(expected, actual);
			    
			    
	
		    
	}
	 
	   @AfterMethod()
	   public void closeBrowserWin()
	   {
		   driver.close();
	   }
	
}
