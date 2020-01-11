package com.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Login_po {
	WebDriver driver;
	
	WebElement txtUsername;
	WebElement txtpass;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
	@DataProvider(name="loginCredentials")
	public Object[][] dp_credentials()
	{
		return new  Object[][]
		{
			{"amit","pass1"},
			//{"rahul","pass2"}
			
			
			
		};
	
		
	}
	
	@Test(dataProvider="loginCredentials")
	public void validateLoginFunctionality(String username,String password) throws InterruptedException{
		
		WebElement myAccount=driver.findElement(By.xpath("//*[contains(text(),'My A')]"));
		WebElement signIn=driver.findElement(By.xpath("//*[@title='Sign in']"));
		myAccount.click();
		signIn.click();
		
		Thread.sleep(20000);
		
		
		/*
		WebDriverWait wait=new WebDriverWait(driver,20);
		  try {
			  txtUsername= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@value='customer@example.com']"))));
			  System.out.println("element is visible");
			  
			  txtUsername.sendKeys(username);
			  
			  txtpass= wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id='psw_popup4']"))));
			  
			  txtpass.sendKeys(password);
			  	  
		} catch (Exception e) {
			System.out.println("element not visible and clicked");
			e.printStackTrace();
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement txtUsername= driver.findElement(By.xpath("//*[@value='customer@example.com']"));
		//WebElement txtpass= driver.findElement(By.xpath("//*[@id='psw_popup4']"));
		
		
		//txtUsername.sendKeys(username);
		//txtpass.sendKeys(password);
		
		
		
		
		
		//WebElement txtusername=driver.findElement(By.
		
		
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
