package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	

	@Test(dataProvider="testdata")
	public void testchrome(String username,String password)
	
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).clear(); 
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys(password); 
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDatafeed()
	{
		Object [][] facebookdata=new Object[2][2];
				
	   
		facebookdata[0][0]="usrname@gmail.com";
   //password
	    facebookdata[0][1]="user123";
	    
	    
		facebookdata[1][0]="usrname@gmail.com";

		facebookdata[1][1]="user123";
		
		
		return facebookdata;

	}	
	
	
}
