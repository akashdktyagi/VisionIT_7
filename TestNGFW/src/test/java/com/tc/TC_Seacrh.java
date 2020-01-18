package com.tc;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.po.PO_Search;
import com.po.Search_po;
import com.utility.Utilitys;

import junit.framework.Assert;

public class TC_Seacrh {
	WebDriver driver;
	PO_Search po_search;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
		
		po_search= new PO_Search(driver);
		
		//Utilitys.initilizebrowser(Constants.browserName);	
		
		
	}
	
	@Test(enabled=false)
	public void SeacrhproductWithProductKey()
	{
		po_search.enterproductKey("Mobile");
		po_search.clickonsecrhButton();
		
		
	}
	
	@Test
	public void AddProductToCart() throws IOException
	{
		po_search.enterproductKey("Mobile");
		po_search.clickonsecrhButton();
		po_search.clickonProduct();
		po_search.AddItemToCart();
		Utilitys.takeScreenShot();
		//Assert.assertEquals(expected, actual);
		
		
		
		
	}

}
