package po;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PO_LoginPage {
	WebDriver driver;
	
	public PO_LoginPage(WebDriver d) {
		this.driver = d;
	
	}

	//Locators
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_main_login\"]")
	WebElement txt_Email;
	@FindBy(how = How.XPATH, using = "//*[@id=\"psw_main_login\"]")
	WebElement txt_Password;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[4]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement btn_SignIn;
	//@FindBy(how =How.XPATH, using = "//*[@class=\"ty-dropdown-box__title cm-combination logged open\"]")
	//WebElement button_My_Account;
	//Methods
	
	private void SetUserName(String arg) {
		
		txt_Email.sendKeys(arg);
	}
	private void SetPassword(String arg) {
		
		txt_Password.sendKeys(arg);
	}
	private void ClickOnSignInButton() throws InterruptedException{
		btn_SignIn.click();
		Thread.sleep(5000);
		
		
	}
	private void cleartxt() {
		txt_Email.clear();
		txt_Password.clear();
	}
	//private void validatelogin() {
		//button_My_Account.click();
		
	//}
	
	public void kw_Sign_in_to_cs_cart(String u, String p) throws InterruptedException {
	cleartxt();
	SetUserName(u);
	SetPassword(p);
	ClickOnSignInButton();
	//validatelogin();
	  //String pageTitleExpected = "Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
	//  String pageTitleActual = driver.getTitle();
	//  Assert.assertEquals(pageTitleExpected, pageTitleActual,"Loting is Not Succefull with username as : "+ u +"password: " + p);
	}
}

