package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_homepg {

	private WebDriver driver;
	
	//page objects/web elements
	@FindBy(xpath="//a[@class='login']")
	WebElement btn_signin;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="passwd")
	WebElement passwrd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signin;
	
	public PO_homepg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void clickonsignin(){
		btn_signin.click();
	}
	
	public void enter_email_id(String args){
		emailid.sendKeys(args);
	}
	
	public void enter_pass(String args) {
		passwrd.sendKeys(args);
	}
	
	public void signin(){
		signin.click();
		
	}
}
