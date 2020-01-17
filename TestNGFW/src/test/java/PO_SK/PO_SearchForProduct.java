package PO_SK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SearchForProduct
{
WebDriver driver;
	
	public PO_SearchForProduct(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	@FindBy(how = How.ID, using ="search_query_top")WebElement txtbox_searchProduct;
	@FindBy(how = How.NAME, using ="submit_search")WebElement btn_search;
	@FindBy(how = How.XPATH, using ="//a[@class='product-name' and @title='Printed Dress']")WebElement product_select;
	@FindBy(how = How.XPATH, using ="//button[@type='submit' and@class='exclusive']")WebElement btn_addtocart;
	@FindBy(how = How.XPATH, using ="//span[@class='cross']")WebElement close;
	
	//methods
	public void Search_Product(String arg) 
	{
		txtbox_searchProduct.sendKeys(arg);
		btn_search.click();
	}
	
	
	public void addtocart()
	{
		product_select.click();
		btn_addtocart.click();
		close.click();
	}
}