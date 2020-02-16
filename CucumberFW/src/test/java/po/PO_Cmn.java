package po;

import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import di.ScnCntxt;


public class PO_Cmn {
	//private static final Logger LOG = LogManager.getLogger(PO_Cmn.class);
	WebDriver driver;
	ScnCntxt cntxt;
	
	public PO_Cmn(ScnCntxt scncntxt) {
		this.driver = scncntxt.DRIVER;
		this.cntxt = scncntxt;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(how=How.NAME,using="hint_q")
	public WebElement txtbx_search; //made it public just to demonstrate flash feature of JS. this should be private
	
	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	private WebElement btn_search;
	
	@FindBy(how=How.XPATH,using="//img[starts-with(@id,'det_img_')]")
	private List<WebElement> collection;
	

	
	//Setters Methods
	private void SetSearchTextBox(String arg) {
		txtbx_search.sendKeys(arg);
		//LOG.info("Search box Key enetered as : " + arg);
		cntxt.SCN.write("Search box Key enetered as : " + arg );
	}
	
	private void ClickSearchButton() {
		btn_search.click();
		//LOG.info("Search Button Clicked");
		cntxt.SCN.write("Search Button Clicked" );
	}
	
	//Business Method
	public void SearchProduct(String arg) {
		SetSearchTextBox(arg);
		ClickSearchButton();
		//LOG.info("Product Searched.");
		cntxt.SCN.write("Product Searched." );
		
	}
	
	//Validation Method
	public void ValidateSearchIsWorking() {
		//Validation 1
		String expected="Search results";
		String actual=driver.getTitle();
		Assert.assertEquals("Page Title Validation", expected, actual);
		//LOG.info("Page title validated. Actual: " + actual + " expected: " + expected);
		//scn.write("Page Title is Validated. Expected: " + expected + " actual: "+ actual);
		cntxt.SCN.write("Page Title is Validated. Expected: " + expected + " actual: "+ actual );
		
		//Validation 2
		List<WebElement> collection = driver.findElements(By.xpath("//img[starts-with(@id,'det_img_')]"));
		
		if (collection.size()>0) {
			Assert.assertTrue(true);
			cntxt.SCN.write("Search Results are displayed. Search Products Count: " + collection.size());
		}else {
			cntxt.SCN.write("Search Results are displayed. No products are returned");
			Assert.assertTrue(false);
		}
	}
}
