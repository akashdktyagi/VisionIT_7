package com.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_order {

	public WebDriver driver;
	
	//page objects/webelements
	@FindBy(xpath="//a[@class='login']")
	WebElement btn_signin;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="passwd")
	WebElement passwrd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signin;
	
	@FindBy(xpath="//input[@class='search_query form-control ac_input']")
	WebElement srch_btn;
	
	@FindBy(xpath="//button[@class='btn btn-default button-search']")
	WebElement srch_box;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement selectpro;
	
	@FindBy(xpath="//*[@class='btn btn-default button-plus product_quantity_up']")
	WebElement increase_quantity;
	
	@FindBy(how=How.ID, using="color_14")
	WebElement select_color;
	
	@FindBy(xpath="//*[@id='add_to_cart' and @class='buttons_bottom_block no-print']")
	WebElement add_to_cart_btn;
	
	/*@FindBy(xpath="//span[@class='continue btn btn-default button exclusive-medium']")
	WebElement continue_shop;
	
	//@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	//@FindBy(partialLinkText="Proceed to checkout")
	//WebElement checkout1;
	
	@FindBy(how=How.CLASS_NAME,using="shopping_cart")
	WebElement view_cart;
	
	@FindBy(how=How.CLASS_NAME,using="button btn btn-default standard-checkout button-medium")
	WebElement checkout;
	*/
	
	
	public PO_order(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void clickonsignin() {
		btn_signin.click();
	}
	
	public void enter_email(String arg) {
		emailid.sendKeys(arg);
	}
	
	public void enter_passwrd(String arg) {
		passwrd.sendKeys(arg);
	}
	
	public void sign_in() {
		signin.click();
	}
	
	public void enterpro(String arg) {
		srch_btn.sendKeys(arg);
	}
	
	public void searchpro() {
		srch_box.click();
	}
	
	public void selectproduct() {
		selectpro.click();
	}
	
	public void increasequanityofpro() {
		increase_quantity.click();
	}
	
	public void select_blue_color() {
		select_color.click();	
	}
	
    public void pro_add_to_cart() {
    	add_to_cart_btn.click();	
	}
    
   /* public void cont_shoping() {
    	continue_shop.click();	
	}
    public void checkout_1() {
    	checkout1.click();	
	}
   
    public void view_my_cart() {
    	view_cart.click();	
	}
    
    public void proceed_to_checkout() {
    	checkout.click();	
	}
    */
}
