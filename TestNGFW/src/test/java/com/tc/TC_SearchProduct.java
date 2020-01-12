package com.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.po.Search_po;
import com.utility.Constants;
import com.utility.Utilitys;

public class TC_SearchProduct {
	WebDriver driver;
	Search_po search_po;
	
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
		search_po= new Search_po(driver);

		
		
		
		//Utilitys.initilizebrowser(Constants.browserName);	
		
		
	}
	
	@Test(priority=1)
	public void seacrhProductWithKeyword()
	{
		search_po.enterTextInSaearhBox("mobile");
		search_po.clickOnSearchButton();
			
	}
	
	@Test(enabled=false,priority=2,invocationCount=2)
	public void AddProductToCart()
	{
		search_po.enterTextInSaearhBox("mobile");
		search_po.clickOnSearchButton();
		search_po.selectProductToAddInCart();
		search_po.addProducttocart();
		
		
	}
	
   @AfterMethod
   public void closeBrowserWin() {
	   driver.close();
   }
	
	
	

	

}
