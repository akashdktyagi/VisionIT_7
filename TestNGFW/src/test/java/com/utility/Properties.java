package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	
	static WebDriver driver;

	static void launch()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");

		  driver=new ChromeDriver();
		  
		  driver.get("https://jqueryui.com/");
			driver.manage().window().maximize();		
		
		
		
	}
	
	
}
