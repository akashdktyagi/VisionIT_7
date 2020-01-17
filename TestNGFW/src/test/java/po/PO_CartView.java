package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_CartView {
WebDriver driver;
	
	public PO_CartView(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	@FindBy(how = How.XPATH, using ="//a[@title='View my shopping cart']")WebElement btn_cart;
	@FindBy(how = How.XPATH, using ="//a[@title='Proceed to checkout' and @class='button btn btn-default standard-checkout button-medium']")WebElement btn_checkout;

	
	//methods
	public void CartView() {
		btn_cart.click();
		btn_checkout.click();
	}
}
