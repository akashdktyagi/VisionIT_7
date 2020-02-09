package Testpages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseSetup.TestBase;
import pages.LoginPO;
import pages.NewCustomerPage;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log4jlogger;
import utility.PageObjectManager;
import utility.Testutil;
import utility.Utility;

public class LoginTC extends TestBase
{
   
   
   LoginPO login = PageObjectManager.getloginpage();
   
	NewCustomerPage custpage;
   
    PageObjectManager pageobject;
    SoftAssert softassert1= new SoftAssert();
    SoftAssert softassert2= new SoftAssert();
    
    String actualuname="mngr223172";
    String actualpass="YsebavE";

    
    
    public LoginTC() {
    	super();
    	
  
	// TODO Auto-generated constructor stub
  }
    
    @BeforeMethod
    public void setup()
    {
    	BrowserIntilization();
    	  login = PageObjectManager.getloginpage();
    }
    
    
  
   
   @Test(enabled=false)
   public void Validatelogintest()
   {
	   BrowserIntilization();
	   
	   login.enter_user_name("mngr245109");
	   login.enter_password("UsatApu");
	   login.click_on_signIN();
	   login.verifypageTitle("Welcome To Manager's Page of Guru99 Bank");
	   
	  
   }

	@Test
   public void validateloginWithAppachePoi()
   {  
	   
	   
	  // BrowserIntilization();
	   Log4jlogger.info("Browser initilize successfully");
	   
	   ExcelUtils.SetExcelFile(Constant.testGuruWorkbook_path, "login");
	   
	   Log4jlogger.info("Testdata file loaded");
	   
	   
	   String uname=ExcelUtils.getCellData(1, 0);
	   
	   Log4jlogger.info("uname from excel file " + uname);
	 
	   
	   
	   
	   login = PageObjectManager.getloginpage();   
	   
	    login.enter_user_name(uname);
	   
	  // Assert.assertEquals(actualuname, uname);
	   
	   Log4jlogger.info("user enter username :"+uname);
	   
	   
	   String pass= ExcelUtils.getCellData(1, 1);
       login.enter_password(pass);
       Log4jlogger.info("Password enter successfully");
       //Assert.assertEquals(actualpass, pass, "Password does not matched");
	   
		  
	   login.click_on_signIN();
	   Log4jlogger.info("User click on login button");
	   
	  // login.verifypageTitle("Welcome To Manager's Page of Guru99 Bank");
	   Log4jlogger.info("User loggin succesfully ");
	   
       softassert1.assertAll();
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
 /*  @Test(dataProvider="testdata")
   public void validateloginwithhashmap(Map datamap)
   {
	  String uname = datamap.get("username").toString();
	  String pass= datamap.get("password").toString();
	  
	  BrowserIntilization();
	  
	  login.enter_user_name(uname);
	  login.enter_password(pass);
      login.click_on_signIN();	  
   }
   */
   
 
   
   
   /*
   @DataProvider(name="logindataprovider")
	public Object[][] getlogindata(){
	   Object[][] data= Testutil. getExcelTestdata("loginwithashmap");
   	return data;
	}
   
   
   
  
   
   
   @Test(dataProvider="logindataprovider",enabled=false)
   public void validateloginwithhashmap(String username,String password)
   {
	 
	 // BrowserIntilization();
	  
	  login = PageObjectManager.getloginpage();
	  WebElement uname= driver.findElement(By.xpath("//*[@type='text' and @name='uid']"));
	  WebElement pass= driver.findElement(By.name("password"));
	  uname.sendKeys(username);
	  pass.sendKeys(password);
	  
	  
	  */
	  
	  
	/*//  login.enter_user_name(username);
	  Utility.TakescrenShot("Enter user name");
	  login.enter_password(password	);
	  Utility.TakescrenShot("Enter Password");
	  login.click_on_signIN();	
	  Utility.TakescrenShot("Click on Login bitton");

   } */
   
   
  
	   

	   
	   
   
   
   @DataProvider
	public Object[][] getRegistrationdata(){
	   Object[][] data= Testutil. getExcelTestdata("Registrationsheet");
   	return data;
	}
 
  @Test(dataProvider="getRegistrationdata",enabled=false)
  public void validateRegistrationPage(String CustomerName,String Address,String City,String State,String pin,
		   String MobNo,String Email,String Password)
  {
	   
   BrowserIntilization();
   
      login = PageObjectManager.getloginpage();
	  
	//  login.enter_user_name("mngr223172");
	/*  Utility.TakescrenShot("Enter user name");
	  login.enter_password("YsebavE");
	  Utility.TakescrenShot("Enter Password");
	  login.click_on_signIN();	
	  Utility.TakescrenShot("Click on Login bitton"); */

	custpage= PageObjectManager.getCustmerPage();
	
	custpage.ClickOnNewCustomerlink();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	custpage.entercustName(CustomerName);
	
	custpage.enterAddress(Address);
	
	custpage.enterCity(City);
	
	custpage.enterstate(State);
	
	custpage.enterPinNo(pin);
	
	custpage.enterMobNo(MobNo);
	
	custpage.enteremail(Email);
	
	custpage.enterPassword(Password);
	
	
	
}
/*
  @Test(description="This is Guru99 login Test with Invalid Credentials")
  public void CheckloginWithInvalidCreadentials()
  {
	  Log4jlogger.startTestCase("CheckloginWithInvalidCreadentials");
      login.validatelogin(driver);
	  Utility.checkAlertisPresent();
	  Log4jlogger.endTestCase("CheckloginWithInvalidCreadentials");
  }
	
  
  
  */
  
   
  
  
  
  @AfterMethod
  public void closebrowser()
  {
	  driver.close();
  }
  
   
  
	

	

}
 