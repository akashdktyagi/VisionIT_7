package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Cmn {

	
	 WebDriver driver;
	 public PO_Cmn(WebDriver driver)
	{
		this.driver = driver;
		
	}
	 //Locator
	 @FindBy(how=How.NAME,using="q")
	 private WebElement txtbx_Search;
	 
	 @FindBy(how=How.XPATH,using="//button[@title='Search']")
	 private WebElement btn_Search;
	 
	 //Setter Methods
	 public void SetSearchTextBox(String arg) {
		 
		 txtbx_Search.sendKeys(arg);
		 
	 }
	 public void ClickSearchButton() {
		 txtbx_Search.click();
		 
	 }
	 public void SearchProduct(String arg) {
		 SetSearchTextBox(arg);
		 ClickSearchButton();
	 }
}
