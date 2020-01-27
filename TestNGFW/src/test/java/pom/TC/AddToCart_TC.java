package pom.TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.PO.AddToCart_PO;

public class AddToCart_TC
{    
	 WebDriver driver;
	 AddToCart_PO atc_po_Object;
	
	 

		@BeforeMethod
		public void setup()
		{
			
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			atc_po_Object=new  AddToCart_PO();
		}
		
		@Test()
		public void productAddToCart()
		{
			
			atc_po_Object.enterProduct();
			atc_po_Object.addToCartProduct();
			
		}

		   @AfterMethod()
		   public void closeBrowser()
		   {
			   driver.close();
		   }
	 
}
