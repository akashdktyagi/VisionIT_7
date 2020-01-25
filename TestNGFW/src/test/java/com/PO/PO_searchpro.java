package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_searchpro {

	
	private WebDriver driver;
	
	//page objects/webelements
	
	@FindBy(xpath="//input[@class='ty-search-block__input cm-hint']")
	WebElement txtsearchbox;
	
	@FindBy(className="ty-search-magnifier")
	WebElement btnsearch;
	
	@FindBy(id="det_img_76")
	WebElement prolaptop;
	
	@FindBy(xpath="//button[@id='button_cart_76']")
	WebElement addtocart;
	
	public PO_searchpro(WebDriver driver)
	{
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	//Action
	public void enterproductkey(String productkey)
	{
	  try {
		
		  txtsearchbox.sendKeys(productkey);
	      } catch (Exception e) 
	  {
		// TODO: handle exception
	}	
	
	}
	
	public void searchproduct()
	{ try {
		
		btnsearch.click();
	}
	catch (Exception e)
	{
		// TODO: handle exception
	}
	}
	
	public void selectproduct_to_addcart()
	{ try {
		prolaptop.click();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	public void proaddtocart()
	{
		try {
			addtocart.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
