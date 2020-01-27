package com.cs_cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class CS_Cart_Test 
{
	WebDriver driver;
	WebElement MyAccount;
	
	WebElement LastName;
	WebElement email;
	WebElement password;
	WebElement password1;
	WebElement MobNumber;
	WebElement drpMonth;
	WebElement drpDate;
	WebElement drpyear;
	
	
	 public void register () throws InterruptedException 
	    {
	        WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	        driver.get("http://demo.cs-cart.com/stores/258f9b19fc547b71/");
	        Reporter.log("CS Cart website Opened", true);
	        
	        
	        
	        //My Account
	        MyAccount = driver.findElement(By.xpath("//span[@class='hidden-phone']"));
	        MyAccount.click();
	        Reporter.log("Clicked on My Account ", true);
	        
	        
	        //driver.findElement(By.xpath("//span[@class='hidden-phone']")).click();
	        driver.findElement(By.xpath("//a[@data-ca-target-id='login_block4']")).click();
	        Reporter.log("Clicked on login button ", true);
	        
	        //driver.findElement(By.id("login_popup4")).sendKeys("customer@example.com");
	        	
	       //sign in
	       driver.findElement(By.xpath("//button[@class='ty-btn__login ty-btn__secondary ty-btn']")).click();
	       Reporter.log("Clicked on sign in  ", true);
	       //search product
	       driver.findElement(By.xpath("//input[@type='text' and @id= 'search_input']"));
	       WebElement searchproduct=driver.findElement(By.name("q"));
	       searchproduct.sendKeys("mobile");
	       Reporter.log("enter search product",true);
	       driver.findElement(By.xpath("//button[@class='ty-search-magnifier']")).click();
	       //select product
	      /* driver.findElement(By.xpath("//img[@id='det_img_76']"));
	       driver.findElement(By.xpath("//form[@name='product_form_76']")).click();*/
	       driver.findElement(By.xpath("//img[@id='det_img_208']"));
	       driver.findElement(By.xpath("//form[@name='product_form_208']")).click();
	       //addtocart
	       driver.findElement(By.xpath("//button[@id='button_cart_208']")).click();
	       Thread.sleep(8000L);
	       
	       //mycart
	       driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled']")).click();
	       driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
	       driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[3]/div/div[2]/div/div/div/form/div[1]/div[2]/a")).click();
	       //checkout
	       driver.findElement(By.xpath("//input[@id='credit_card_number_1']")).sendKeys("1223456789123412");
	       driver.findElement(By.xpath("//input[@name='payment_info[expiry_month]']")).sendKeys("05");
	       driver.findElement(By.xpath("//input[@name='payment_info[expiry_year]']")).sendKeys("12");
	       driver.findElement(By.xpath("//input[@name='payment_info[cardholder_name]']")).sendKeys("ABCXYZ");
	       driver.findElement(By.xpath("//input[@name='payment_info[cvv2]']")).sendKeys("055");
	      
	       
	       JavascriptExecutor js= (JavascriptExecutor) driver;
	       js.executeScript("window.scrolledBy(0,1000)");
	       
	       driver.findElement(By.xpath("//input[@name='accept_terms']")).click();
	      
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       //driver.quit();
	    }
	
	
}
