package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInAndRegister {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	@Test
	public void SignIn()
	{
		
		 //click on myAccount
		  WebElement myAccount=driver.findElement(By.xpath("//a[@class='ty-account-info__title']"));
		  myAccount.click();
		  WebElement Clickonsignin=driver.findElement(By.xpath("//a[@rel='nofollow' and @data-ca-target-id='login_block4' ]"));
		  Clickonsignin.click();
		  
		  //Enter email and pass
		  WebElement SendEmail=driver.findElement(By.xpath("//input[@id='login_popup4']"));
		  SendEmail.sendKeys("priti");
		  WebElement Sendpass=driver.findElement(By.xpath("//input[@id='psw_popup4']"));
		  Sendpass.sendKeys("1234");
		  
		  //clickonsignin
		  WebElement click=driver.findElement(By.name("dispatch[auth.login]"));
		  click.click();
          System.out.println("SignIn Sucess");
	}
	@Test
	public void Register()
	{
		//Clickonmyaccount
		 WebElement myAccount=driver.findElement(By.xpath("//a[@class='ty-account-info__title']"));
		  myAccount.click();
		 WebElement Clickonregister=driver.findElement(By.xpath("//a[@rel='nofollow' and @class='ty-btn ty-btn__primary']"));
		 Clickonregister.click();
		 //filling imformation
		 WebElement name=driver.findElement(By.name("user_data[firstname]"));
		 name.sendKeys("Priti");
		 WebElement last=driver.findElement(By.name("user_data[lastname]"));
		 last.sendKeys("Jodh");
		 
		 WebElement phone=driver.findElement(By.name("user_data[phone]"));
		 phone.sendKeys("982326");
		 WebElement email=driver.findElement(By.name("user_data[email]"));
		 email.sendKeys("Jodh.@gmail");
		 
		 WebElement pass=driver.findElement(By.name("user_data[password1]"));
		 pass.sendKeys("Jodh");
		 WebElement returnpass=driver.findElement(By.name("user_data[password2]"));
		 returnpass.sendKeys("Jodh1");
	
		 WebElement Calender=driver.findElement(By.xpath("//i[@title='Calendar']"));
		 Calender.click();
	     Select month= new Select(driver.findElement(By.className("ui-datepicker-month")));
	     month.selectByIndex(5);
	     WebElement date=driver.findElement(By.linkText("14"));
	     date.click();
	     Select year= new Select(driver.findElement(By.className("ui-datepicker-year")));
         year.selectByVisibleText("1955");
     //click on my i'm not robot 
        WebElement captcha=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
	    captcha.click();
	    WebElement Register=driver.findElement(By.xpath("//button[@class='ty-btn__secondary ty-btn']"));
	    Register.click();
	}
	

}
