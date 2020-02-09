package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSetup.TestBase;
import interfaceManager.SelImplementation;
import utility.Log4jlogger;

public class NewCustomerPage extends TestBase
{
	SelImplementation sel;
	
	
	@FindBy(xpath="//input[contains(@onblur,'validatecustomername')]")
	private static WebElement customername;
	
	@FindBy(xpath="//*[@name='addr']")
	private static WebElement address;
	
	@FindBy(xpath="//*[@name='city']")
	private static WebElement city;
	
	@FindBy(xpath="//*[@name='state']")
	private static WebElement state;
	
	@FindBy(xpath="//*[@name='pinno']")
	private static WebElement pinno;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	private static WebElement tetephoneno;
	
	@FindBy(xpath="//*[@name='emailid']")
	 private static WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private static WebElement pass;
	
	@FindBy(xpath="//a[contains(text(),'New Cu')]")
	private static WebElement Newcutomerlink;
	
	
	
	
	
	public NewCustomerPage() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
		sel= new SelImplementation();
		
		
	}
	
	
	
	public static void ClickOnNewCustomerlink () {
        Newcutomerlink.click();		
        Log4jlogger.info("user click on new customer page");
	}
	
	
	
	public  static void entercustName(String Custname)
	{
		try {
			customername.sendKeys(Custname);
			Log4jlogger.info("User enter cust name ");

			
		} catch (Exception e) {
			Log4jlogger.info("not able to enter user name");
		}
	}
	
	
	public  static void enterAddress(String custaddress)
	{
		address.sendKeys(custaddress);
	}
	
	public  static void enterCity(String custCity)
	{
		city.sendKeys(custCity);
	}
	
	
	
	public  static void enterstate(String cstate)
	{
		state.sendKeys(cstate);
	}
	
	public  static void enterPinNo(String PinNo)
	{
		pinno.sendKeys(PinNo);
	}
	public  static void enterMobNo(String MobNo)
	{
		tetephoneno.sendKeys(MobNo);
	}
	
	public  static void enteremail(String Email)
	{
		email.sendKeys(Email);
	}
	public  static void enterPassword(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
