package CsCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class SignIn 
	{
		static WebElement dropMonth;
		static WebElement dropYear;
		WebElement searchbox;
		public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\\\visionit\\\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.navigate().to("http://demo.cs-cart.com/stores/cdd2d6e533ba997a/");
		Reporter.log("URL Opened <br>",true);
		//My Account
		Driver.findElement(By.xpath("//*[@id=\"sw_dropdown_4\"]/a/span")).click();
		//SignUp
		Driver.findElement(By.xpath("//*[@id=\"account_info_4\"]/div[2]/a[1]")).click();
         //
	    Driver.findElement(By.xpath("//input[@name='user_login']"));
		Driver.findElement(By.xpath("//*[@id=\"psw_popup4\"]"));
		Reporter.log("Username and password entered <br>",true);

		//remember
		Driver.findElement(By.xpath("//label[@for='remember_me_popup4' and @class='ty-login__remember-me-label']")).click();
		//Driver.findElement(By.xpath("//*[@id=\"remember_me_main_login\"]")).click();
		//SignUp
		Driver.findElement(By.xpath("//button[@class='ty-btn__login ty-btn__secondary ty-btn' and @type ='submit']")).click();
		Reporter.log("Click on Sign In <br>",true);
		//search
		Driver.findElement(By.xpath("//input[@class='ty-search-block__input cm-hint' and @name='hint_q']"));
	     WebElement searchbox = Driver.findElement(By.name("q"));
	     searchbox.sendKeys("Laptop");
	     searchbox.submit();
	     //click on laptop
	     Driver.findElement(By.xpath(" //img[@id=\"det_img_219\"]")).click();
	     Reporter.log("Search Product Laptop <br>",true);
	     //Add to cart
	     Driver.findElement(By.xpath(" //button[@id=\"button_cart_219\"]")).click();
	     Reporter.log("Add to cart product successfully<br>",true);
	}
	
	
	}


