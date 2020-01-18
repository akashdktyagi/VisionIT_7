package Carts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Cart_E {
	
	@Test
	public static void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.cs-cart.com");
	Reporter.log("Url Open",true);
    	driver.findElement(By.xpath("//a[@class='ty-account-info__title']")).click();
    Reporter.log("Clicked on My Account",true);
    	driver.findElement(By.xpath("//a[@class='cm-dialog-opener cm-dialog-auto-size ty-btn ty-btn__secondary']")).click();
    Reporter.log("Clicked on Sign In",true);
	driver.findElement(By.name("dispatch[auth.login]")).click();
	Reporter.log("Sign In Successful",true);
	}

}
