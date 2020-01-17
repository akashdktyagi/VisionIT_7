package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SearchProduct2 {
WebDriver driver;
	
	public PO_SearchProduct2(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	//	@FindBy(how = How.ID, using ="search_query_top")WebElement txtbox_searchProduct;
	//	@FindBy(how = How.NAME, using ="submit_search")WebElement btn_search;
	
	@FindBy(how = How.XPATH, using ="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")WebElement btn_tshirts;
	@FindBy(how = How.XPATH, using ="//*[@class='product-name' and @title='Faded Short Sleeve T-shirts']")WebElement product_tshirt;
	@FindBy(how = How.NAME, using ="Blue")WebElement color_pick;
	@FindBy(how = How.ID, using ="quantity_wanted")WebElement txtbox_qty_wtd;
	@FindBy(how = How.XPATH, using ="//button[ @type='submit' and @class='exclusive']")WebElement btn2_addtocart;
	@FindBy(how = How.XPATH, using ="//span[ @title='Continue shopping' and @class='continue btn btn-default button exclusive-medium']")WebElement btn_cont_shop;
	
	//methods
	public void Search_Product2() {
		btn_tshirts.click();
		product_tshirt.click();
	}
	public void color_pick(){
		color_pick.click();
	}
	public void quantity(String arg){
		txtbox_qty_wtd.sendKeys(arg);
	}
	public void addtocart2() {
		btn2_addtocart.click();
		btn_cont_shop.click();
	}
}
