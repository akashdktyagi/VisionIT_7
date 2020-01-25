package com.TC;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PO.PO_searchpro;

public class TC_searchpro 
{
   WebDriver driver;
   PO_searchpro po_search;
   
   @BeforeMethod
   public void setup()
   {	//System.setProperty("webdriver.chrome.driver","/Batch7TestNGFW/src/test/java/config1/chromedriver.exe");
	    driver = new ChromeDriver();
     	driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
	   
	    po_search=new PO_searchpro(driver);
	   
   }
     
	@Test
	public void searchproductusingproductkey()
	{
		po_search.enterproductkey("laptop");
		po_search.searchproduct();
	
	}
	
	@Test
	public void addproducttocart()
	{
		po_search.enterproductkey("laptop");
		po_search.searchproduct();
		po_search.selectproduct_to_addcart();
		po_search.proaddtocart();
		String pageTitleExpected="Electronics :: Cell Phones :: Motorola :: FLIPSIDE with MOTOBLUR";
		String pageTitleActual=driver.getTitle();
		Assert.assertEquals(pageTitleExpected, pageTitleActual, "page is not able to navigate");
			
	}
	
	
	
	
}
