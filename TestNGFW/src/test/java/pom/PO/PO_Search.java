package pom.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Search
{

	private WebDriver driver;


	//page objects/webelements
	
	@FindBy(xpath="//*[@id=\"tygh_main_container\"]/div[1]/div/div/div[3]/div")
	WebElement btnMyAccount;

	
	 @FindBy(xpath="//*[@class='cm-dialog-opener cm-dialog-auto-size ty-btn ty-btn__secondary']")
	    WebElement btn1Signin;
	    
	    @FindBy(name="dispatch[auth.login]")
	    WebElement btn2Signin;

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
    	
    	
    	public void clickOnMyAccount()
    	{
    		btnMyAccount.click();
    	}
    	
    	public void clickOnSignin()
    	{
    		btn1Signin.click();
    	}
    	
    	public void clickOnSignPopup()
    	{
    		btn2Signin.click();
    	}

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
			
		}
	}

	public void AddItemToCart()
	{
		try {
			btnAddtoCart.click();
		} catch (Exception e) {
			
		}
	}


	
	
}
