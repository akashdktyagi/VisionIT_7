package tc;

import org.testng.annotations.Test;
import po.PO_Homepage_AT;
import po.PO_LoginPage_AT;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TC_LoginPage {
  @Test
  public void tc_validate_login() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://automationpractice.com");
	  //Implicity Wait
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  //Object creation of Home Page using Page Factory
	  PO_Homepage_AT PO_Homepage = PageFactory.initElements(driver, PO_Homepage_AT.class);
	  PO_Homepage.ClickonSignInButton();
  
	  //Object creation of Login Page using Page Factory
	  PO_LoginPage_AT PO_LoginPage = PageFactory.initElements(driver, PO_LoginPage_AT.class);
	  String username = "123distamt@gmail.com";
	  String password = "amt@123";
	/*  PO_LoginPage.SetUsername(username);
	  	PO_LoginPage.SetPassword(password);
	  	PO_LoginPage.ClickSignInButton();
	*/  
	  PO_LoginPage.login_into_Ecom(username, password);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
