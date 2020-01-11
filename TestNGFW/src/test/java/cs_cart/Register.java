package cs_cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Register
{
   WebDriver driver;
   WebElement MyAccount;
   WebElement Firstname;
   WebElement Lastname;
   WebElement email;
   WebElement Passwrd;
   WebElement Passwrd1;
   WebElement Mobnumber;
   WebElement drpmonth;
   WebElement drpday;
   WebElement drpyear;
   
   
   @Test
   public void register()
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("http://demo.cs-cart.com/stores/8754b4a51a9db2f8/");
	   
	   
	   //MyAccount
	   MyAccount=driver.findElement(By.xpath("//a[@class='ty-account-info__title']"));
	   MyAccount.click();
	   driver.findElement(By.xpath("//a[contains(text(),'Register')and @class='ty-btn ty-btn__primary']")).click();
	   
	   driver.findElement(By.xpath("//input[@name='user_data[firstname]']")).sendKeys("Neha");
	   
	   driver.findElement(By.xpath("//input[@name='user_data[lastname]']")).sendKeys("Dhande");
	   
	   driver.findElement(By.xpath("//input[@type='text' and @id='email']")).sendKeys("neha94dhande@gmail.com");
	   
	   driver.findElement(By.xpath("//input[@type='password' and @id='password1']")).sendKeys("neha$2694");
	   
	   driver.findElement(By.xpath("//input[@type='password' and @id='password2']")).sendKeys("neha$2694");
	   
	   //select Birth date
	   driver.findElement(By.xpath("//input[@type='text' and @id='birthday']")).click();
	   
	   Select drpmonth=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	   drpmonth.selectByVisibleText("May");
	   
	   Select drpyear=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	   drpyear.selectByVisibleText("1994");
	   
	   driver.findElement(By.xpath("//a[@class='ui-state-default'and contains(text(),'26')]")).click();
	  
	      
   }
   
}
