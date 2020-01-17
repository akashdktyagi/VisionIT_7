package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SearchProduct {
WebDriver driver;
	
	public PO_SearchProduct(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	@FindBy(how = How.ID, using ="search_query_top")WebElement txtbox_searchProduct;
	@FindBy(how = How.NAME, using ="submit_search")WebElement btn_search;
	
	@FindBy(how = How.XPATH, using ="//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")WebElement product_select;
	@FindBy(how = How.XPATH, using ="//button[@class='exclusive' and @name='Submit']")WebElement btn_addtocart;
	@FindBy(how = How.XPATH, using ="//span[@class='continue btn btn-default button exclusive-medium' and @title='Continue shopping']")WebElement btn_cont_shop;
	
	//methods
	public void Search_Product(String arg) {
		txtbox_searchProduct.sendKeys(arg);
		btn_search.click();
	}
	public void addtocart() {
		product_select.click();
		btn_addtocart.click();
		btn_cont_shop.click();
	}
}
