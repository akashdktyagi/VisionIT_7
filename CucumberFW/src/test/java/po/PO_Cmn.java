package po;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Cmn {

	WebDriver driver;
	
	public PO_Cmn(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	@FindBy(how=How.NAME,using="hint_q")
	private WebElement txtbx_search;
	
	@FindBy(how=How.XPATH,using="//button[@title='Search']")
	private WebElement btn_search;
	
	@FindBy(how=How.XPATH,using="//img[starts-with(@id,'det_img_')]")
	private List<WebElement> collection;
	

	
	//Setters Methods
	private void SetSearchTextBox(String arg) {
		txtbx_search.sendKeys(arg);
	}
	
	private void ClickSearchButton() {
		btn_search.click();
	}
	
	//Business Method
	public void SearchProduct(String arg) {
		SetSearchTextBox(arg);
		ClickSearchButton();
		
	}
	
	//Validation Method
	public void ValidateSearchIsWorking() {
		//Validation 1
		String expected="Search results";
		String actual=driver.getTitle();
		Assert.assertEquals("Page Title Validation", expected, actual);
		//scn.write("Page Title is Validated. Expected: " + expected + " actual: "+ actual);
		
		//Validation 2
		List<WebElement> collection = driver.findElements(By.xpath("//img[starts-with(@id,'det_img_')]"));
		
		if (collection.size()>0) {
			Assert.assertTrue(true);
			//scn.write("Search Results are displayed. Search Products Count: " + collection.size());
		}else {
			//scn.write("Search Results are displayed. No products are returned");
			Assert.assertTrue(false);
		}
	}
}
