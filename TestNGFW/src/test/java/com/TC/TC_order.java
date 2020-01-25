package com.TC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;


import com.PO.PO_order;

public class TC_order {

	public static WebDriver driver;
	
	PO_order po_order;
	
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
		public void order()
		{
			
		    po_order.enterpro("T-shirts");
		    po_order.searchpro();
		    po_order.selectproduct();
		    po_order.increasequanityofpro();
		    po_order.select_blue_color();
		    po_order.pro_add_to_cart();
		    //po_order.cont_shoping();
		    //po_order.checkout_1();
		    //new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
		    //po_order.view_my_cart();
		    
		}
		
		public static void TakesScreenshot() throws IOException
		{
			TakesScreenshot scrsot=(TakesScreenshot)driver;
			File scrshotfile=scrsot.getScreenshotAs(OutputType.FILE);
			File destfile=new File("F:\\VisionIT_7\\VisionIT_7\\TestNGFW\\src\\test\\java\\screenshot\\scr.png");
			FileUtils.copyFile(scrshotfile,destfile );	
					
		}
		
		
}
