package com.facbook.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Loginpage;

public class Verifyfacebook 
   
{
	WebDriver driver;
	
     @Test
	 public void verifylogin()
	 {
 		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");

		  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");

		 Loginpage login=new Loginpage(driver);
		 
		 login.typeemail();
		 login.typepassword();
		 login.clickonlogin();
		 login.getLoginTitle();
		 
		 driver.close();

	 }
	

		
		 
}

