package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Checkout {
WebDriver driver;
	public PO_Checkout(WebDriver d) 
	{
		this.driver=d;
	}
	
	//Locators
	
	@FindBy(how = How.XPATH, using ="//textarea[@name='message' and @class='form-control']")WebElement txtbox_comment;
	@FindBy(how = How.XPATH, using ="//button[@name='processAddress' and @class='button btn btn-default button-medium']")WebElement btn_add_chkout;
	@FindBy(how = How.ID, using ="cgv")WebElement chkbox;
	@FindBy(how = How.NAME, using ="processCarrier")WebElement btn_shp_chkout;
	@FindBy(how = How.XPATH, using ="//a[@class ='bankwire']")WebElement btn_pymt_bankwire;
	@FindBy(how = How.XPATH, using = "//button[@class ='button btn btn-default button-medium']")WebElement btn_confirm;
	
	//methods
	
	public void cust_avaibility_in_comment(String arg) {
		txtbox_comment.sendKeys(arg);
		btn_add_chkout.click();
	}
	public void shipping() {
		chkbox.click();
		btn_shp_chkout.click();
	}
	public void payment_method() {
		btn_pymt_bankwire.click();
		btn_confirm.click();
		
	}
	
}
