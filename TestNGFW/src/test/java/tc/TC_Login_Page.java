package tc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import po.PO_CartView;
import po.PO_Checkout;
import po.PO_Homepage_AT;
import po.PO_LoginPage_AT;
import po.PO_SearchProduct;
import po.PO_SearchProduct2;

public class TC_Login_Page 
{
	@Test
	public void tc_validate_login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		Reporter.log("Navigated to Automation Practice's Website");
		  //Implicity Wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  //Object creation of Home Page using Page Factory
		  PO_Homepage_AT Po_Homepage=PageFactory.initElements(driver,PO_Homepage_AT.class);
		  Po_Homepage.ClickonSignInButton();
		  Reporter.log("Clicked on Sign In Button");
	  
		  //Object creation of Login Page using Page Factory
		  PO_LoginPage_AT PO_LoginPage = PageFactory.initElements(driver, PO_LoginPage_AT.class);
		  String username = "123distamt@gmail.com";
		  String password = "amt@123";
		/*  PO_LoginPage.SetUsername(username);
		  	PO_LoginPage.SetPassword(password);
		  	PO_LoginPage.ClickSignInButton();
		*/  
		  PO_LoginPage.login_into_Ecom(username, password);
		  Reporter.log("Input username : "+username+ "Password as :" +password);
		  Reporter.log("Clicked on Login Button");
		  
		  //object creation of search product
		  PO_SearchProduct SearchProduct=PageFactory.initElements(driver, PO_SearchProduct.class);
		  SearchProduct.Search_Product("Summer Dresses");
		  Reporter.log("Searched for Summer Dresses");
		  SearchProduct.addtocart();
		  Reporter.log("Clicked on add to cart");
		  
		//object creation of search product 2
		  PO_SearchProduct2 SearchProduct2=PageFactory.initElements(driver, PO_SearchProduct2.class);
		  SearchProduct2.Search_Product2();
		  Reporter.log("Clicked on T-Shirts");
		  SearchProduct2.color_pick();
		  Reporter.log("Color picked as Blue");
		  SearchProduct2.quantity("2");
		  Reporter.log("Quantity input as 2");
		  SearchProduct2.addtocart2();
		  Reporter.log("Clicked on add to cart");

		//object creation of Cart View
		  PO_CartView PO_CartView = PageFactory.initElements(driver, PO_CartView.class);
		  PO_CartView.CartView();
		  Reporter.log("Clicked on View my shopping cart");
		  
		//object creation of Cart View
		  PO_Checkout PO_Checkout = PageFactory.initElements(driver, PO_Checkout.class);
		  String com_msg ="Please Deliver product between 7am to 10am or 6pm to 10pm, Thank You";
		  PO_Checkout.cust_avaibility_in_comment(com_msg);
		  Reporter.log("Written Message as :"+com_msg);
		  PO_Checkout.shipping();
		  Reporter.log("Clicked on Terms and services and Checkout");
		  PO_Checkout.payment_method();
		  Reporter.log("Clicked on Payment Method as Wire and Confirm the order");
		  driver.quit();
	}
	 @BeforeMethod
	  public void beforeMethod() 
	  {
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
	  }
}
