package Testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseSetup.TestBase;
import pages.LoginPO;
import pages.NewCustomerPage;
import utility.PageObjectManager;
import utility.Testutil;

public class NewCustomerRegTest  extends TestBase{
	
	NewCustomerPage custpage;
	LoginPO login = PageObjectManager.getloginpage();
	
	public NewCustomerRegTest() {
		super();
	}
	
	
	  @BeforeMethod
	    public void setup()
	    {
	    	BrowserIntilization();
	    	  login = PageObjectManager.getloginpage();
	    }
	    
	    
	
	
	
	 @DataProvider
	 	public Object[][] getRegistrationdata(){
	 	   Object[][] data= Testutil. getExcelTestdata("Registrationsheet");
	    	return data;
	 	}
	  
	   @Test(dataProvider="getRegistrationdata",description="This is new Customer registration Test with dummy data")
	   public void validateRegistrationPage(String CustomerName,String Address,String City,String State,String pin,
			   String MobNo,String Email,String Password)
	   {
		   
	   
		custpage= PageObjectManager.getCustmerPage();
		
		custpage.entercustName(CustomerName);
		
		custpage.enterAddress(Address);
		
		custpage.enterCity(City);
		
		custpage.enterstate(State);
		
		custpage.enterPinNo(pin);
		
		custpage.enterMobNo(MobNo);
		
		custpage.enteremail(Email);
		
		custpage.enterPassword(Password);
		
		
		
		
		   
	   }

	
	}
	
	
	
	

