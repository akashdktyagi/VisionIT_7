package com.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utilitys;

public class Search_po
{
	//WebDriver driver;
	
   //page objects/page object repo
	
	@FindBy(xpath="//*[@id='search_input']")
	WebElement txtSearchInput;
	
	@FindBy(xpath="//*[@title='Search']")
	WebElement btnSearch;
	
	
	@FindBy(xpath="//*[@id='det_img_73']")
	WebElement mobProduct;
	
	@FindBy(id="button_cart_73")
	WebElement btnAddToCart;
	
	
	
	//initialize page ojects/ webelements
	public Search_po(WebDriver driver) 
	{
		
		Utilitys.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterTextInSaearhBox(String SearchProductKey)
	{
		try {
			txtSearchInput.sendKeys(SearchProductKey);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
	}
	
	
	public void clickOnSearchButton()
	{
		try {
			btnSearch.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectProductToAddInCart()
	{
		try {
			mobProduct.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void addProducttocart()
	{
		try {
			btnAddToCart.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
