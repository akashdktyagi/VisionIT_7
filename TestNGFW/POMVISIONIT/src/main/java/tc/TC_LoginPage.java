package tc;

import org.testng.annotations.Test;

import po.PO_HomePage;
import po.PO_LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TC_LoginPage {
  @Test
  public void t_01_Validate_login_cs_cart() throws InterruptedException {
	  
	  //System.setProperty(arg0,arg1);
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.cs-cart.com/");
	  driver.manage().window().maximize();
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  //Create Object of Home Page usingPAge Factory
	  PO_HomePage po_HomePage = PageFactory.initElements(driver, PO_HomePage.class);
			  
	// Call the Method
	  po_HomePage.ClickOnMy_Account();
	  
	  // Create Object of LoginPage Using Page Factory
	  PO_LoginPage po_LoginPage=PageFactory.initElements(driver, PO_LoginPage.class);
	  String s_user = "customer@example.com";
	  String s_pass = "customer";
	  /*
	  po_LoginPage.SetEmail(s_user);
	  po_LoginPage.SetPassword(s_pass);
	  po_LoginPage.ClickSignInButton();
	  */
	  
	  po_LoginPage.kw_Sign_in_to_cs_cart(s_user, s_pass);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
