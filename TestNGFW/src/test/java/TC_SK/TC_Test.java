package TC_SK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PO_SK.PO_Homepage;
import PO_SK.PO_Login;
import PO_SK.PO_SearchForProduct;

public class TC_Test
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
		  PO_Homepage Po_Homepage=PageFactory.initElements(driver,PO_Homepage.class);
		  Po_Homepage.ClickonSignInButton();
		  Reporter.log("Clicked on Sign In Button");
	  
		  //Object creation of Login Page using Page Factory
		  PO_Login PO_LoginPage = PageFactory.initElements(driver, PO_Login.class);
		  String username = "123distamt@gmail.com";
		  String password = "amt@123";
		
		  PO_LoginPage.login_into_Ecom(username, password);
		  Reporter.log("Input username : "+username+ "Password as :" +password);
		  Reporter.log("Clicked on Login Button");
		  
		  //object creation of search product
		  PO_SearchForProduct SearchProduct=PageFactory.initElements(driver, PO_SearchForProduct.class);
		  SearchProduct.Search_Product("Casual Dresses");
		  Reporter.log("Searched for Casual Dresses");
		  SearchProduct.addtocart();
		  Reporter.log("Clicked on add to cart and close the window");
	}
}
