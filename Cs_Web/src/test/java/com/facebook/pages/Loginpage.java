/**
 * 
 */
package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	
	WebDriver driver;

	By email= By.id("email");
	By password=By.xpath("//input[@id='pass']");
	By loginbutton=By.xpath("//input[@type='submit']");
	By titleText=By.xpath("//i[@class='fb_logo img sp_W-v012zTIDG sx_4f5409']");
	
	
	
	public Loginpage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void typeemail()
	{
	
		driver.findElement(email).sendKeys("amolbujade@gmail.com");
		
	}
	
	
	public void typepassword()
	{
       driver.findElement(password).sendKeys("9156908237");
	}
	
	
	public void clickonlogin()
	{
		
		driver.findElement(loginbutton).click();
	}
	
	
	 public String getLoginTitle(){

	     return    driver.findElement(titleText).getText();

	    }

 
}
	
	
	
