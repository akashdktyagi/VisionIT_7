package com.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Search {
	private WebDriver driver;
	
	
	//page objects/webelements
	
	@FindBy(xpath="//*[@title='Search products']")
	WebElement txtsearchbox;
	
	@FindBy(className="ty-search-magnifier")
	WebElement btnSearch;
	
	@FindBy(id="det_img_73")
	WebElement proMobile;
	
	@FindBy(xpath="//*[@id='button_cart_73']")
	WebElement btnAddtoCart;
	
	
	
	
	
	
	public PO_Search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	//Action
	
	public void enterproductKey(String Productkey) {
		
		try {
			
			txtsearchbox.sendKeys(Productkey);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
	public void clickonsecrhButton()
	{
		try {
			btnSearch.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickonProduct()
	{
		try {
		proMobile.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void AddItemToCart()
	{
		try {
			btnAddtoCart.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	

}
