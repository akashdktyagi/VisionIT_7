package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample
{
 WebDriver driver;
 
      @BeforeMethod
     public void setup()
     {
		   // open chrome
			 driver = new ChromeDriver();
			 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
			driver.manage().window().maximize();

			// navigate to url
			driver.navigate().to("https://www.facebook.com/");
     }
     
     @Test(dataProvider="testData")//getData is the name of provider
     public void testLogin(String username, String password)
     {
    	 driver.findElement(By.xpath("//input[@id='email']")).clear();
    	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
    	 
    	 driver.findElement(By.xpath("//input[@id='pass']")).clear();
    	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
    	 System.out.println("your name is :: " +username);
          System.out.println("your password is :: " +password);
     }
    
     
     //getData method will fetch the data 
     @DataProvider(name="testData")
     public String [][] getData()
     {  
          //here getData is the DataProvider method name
             //rows = no. of times your data will execute
    	 //columns= no. of parameters in testdata
    	
    	 String[][] data=new String[3][2];
    	 //1st Row
    	data[0][0]="rahul";
    	data[0][1]="test432";
    	
    	//2nd Row
    	data[1][0]="vaishali";
    	data[1][1]="test123";
    	
    	//3rd Row
    	data[2][0]="shubham";
    	data[2][1]="test999";
    	
    	return data;
    	 
    	 
    	 
    	 
     }
}
