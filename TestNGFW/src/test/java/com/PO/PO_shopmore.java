package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_shopmore {

	public WebDriver driver;
	
	//Locators
	//@FindBy(xpath="//input[@class='search_query form-control ac_input' ]")
	//WebElement srch_box;
	
	@FindBy(className="sf-with-ul")
	WebElement dress;
	
	@FindBy(className="replace-2x img-responsive")
	WebElement select_dress;
	
	@FindBy(className="icon-plus")
	WebElement incr_quan;
	
	@FindBy(className="selector")
	WebElement sizes_s;
	
	
	
	public PO_shopmore(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dresses()
	{
		dress.click();
	}
	
	public void select_dress()
	{
		select_dress.click();
	}
	
	public void increase_quan()
	{
		incr_quan.click();
	}
	
	public void select_size()
	{
	    sizes_s.click();
	}
	
}
