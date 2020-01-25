package com.TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PO.PO_order;
import com.PO.PO_shopmore;

public class TC_shopmore {
    public static WebDriver driver;
	
	PO_order po_order;
	PO_shopmore po_shopmore;
	
	   @BeforeMethod
	   public void setup()
	   {	//System.setProperty("webdriver.chrome.driver","/Batch7TestNGFW/src/test/java/config1/chromedriver.exe");
		    driver = new ChromeDriver();
	     	driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
		   
		    po_order=new PO_order(driver);
		   
	   }
	   
	   @Test
		public void signin()
		{
		    po_order.clickonsignin();
			po_order.enter_email("123distamt@gmail.com");
			po_order.enter_passwrd("amt@123");
			po_order.sign_in();
			//String PageTitleActual="My account - My Store";
			//String PageTitleExpected=driver.getTitle();
			
			//Assert.assertEquals(PageTitleExpected, PageTitleActual,"page is unable to navigate");
			
		}
		
	   @Test
	   public void shop_more()
	   {
		   po_shopmore.dresses();
		   po_shopmore.select_dress();
		   po_shopmore.increase_quan();
		   po_shopmore.select_size();
		      
	   }
	   
	   
	   
	   
}
