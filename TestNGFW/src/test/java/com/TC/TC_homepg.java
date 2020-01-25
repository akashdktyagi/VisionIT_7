package com.TC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PO.PO_homepg;
import com.PO.PO_searchpro;

import cucumber.api.cli.Main;

public class TC_homepg
{
   WebDriver driver;
   PO_homepg po_homepg;
   
   @BeforeMethod
   public void setup()
   {	//System.setProperty("webdriver.chrome.driver","/Batch7TestNGFW/src/test/java/config1/chromedriver.exe");
	    driver = new ChromeDriver();
     	driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    po_homepg=new PO_homepg(driver);
	   
   }
	

	@Test
	public void signin()
	{
		po_homepg.clickonsignin();
		po_homepg.enter_email_id("123distamt@gmail.com");
		po_homepg.enter_pass("amt@123");
		po_homepg.signin();
		//String PageTitleExpected="My account-My Store";
		//String PageTitleActual=driver.getTitle();
		
		//Assert.assertEquals(PageTitleExpected, PageTitleActual,"page is unable to navigate");
		
	}
	
	
}
