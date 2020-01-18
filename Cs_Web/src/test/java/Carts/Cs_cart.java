package Carts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Cs_cart {
	
	@Test
	 public void cartDemo() throws InterruptedException 
	   {
		
		   //open Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Reporter.log("chrome open",true);
			
			//navigate to url
			driver.navigate().to("demo.cs-cart.com");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Reporter.log("url open",true);
			//open my account
			WebElement MyAccount=driver.findElement(By.xpath("//*[@id=\"sw_dropdown_4\"]/a/span"));
			 MyAccount.click();
			 
			 //signin
			 driver.findElement(By.xpath("//a[@class='cm-dialog-opener cm-dialog-auto-size ty-btn ty-btn__secondary']")).click();
			 driver.findElement(By.xpath("//button[@name='dispatch[auth.login]']")).click();
			 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 Reporter.log("sign in successfull",true);
			 
			 
			 //Search product
			driver.findElement(By.xpath("//input[@name='hint_q']"));
			WebElement search_box=driver.findElement(By.name("q"));
			search_box.sendKeys("computer");
			search_box.submit();
			 Reporter.log("product searched successfully",true);
			
			//AddToCart 
			
			driver.findElement(By.xpath("//*[@id=\"icons_221\"]/div[1]/div/div[11]/div/a"));
			WebElement product=driver.findElement(By.id("det_img_221"));
			product.click();
			 Reporter.log("added to cart successfully",true);
			
			//decide quantity
			WebElement quantity=driver.findElement(By.xpath("//a[@class='cm-increase ty-value-changer__increase']"));
			 Reporter.log("quantity increased successfully",true);
			
			//want more than one product in cart
			int i=0;
			while(i<2)
			{
				quantity.click();
				i++;
			}
			
			driver.findElement(By.xpath("//button[@id='button_cart_221']")).click();//addtoCartClick
			 Thread.sleep(6000L);
			 
			 
			//click on Mycart
			driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled']")).click();
			
			//click on view cart
			driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
			Reporter.log("checked product successfully",true);
			
           //proceed to checkout
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[3]/div/div[2]/div/div/div/form/div[1]/div[2]/a")).click();
			Reporter.log("checkout success",true);
			
			//place order details
			WebElement card_number=driver.findElement(By.xpath("//input[@id='credit_card_number_1']"));
			card_number.sendKeys("0987654321098765");
			
			//cvv number
			driver.findElement(By.xpath("//input[@id='credit_card_cvv2_1']")).sendKeys("864");
			
			//month
			driver.findElement(By.xpath("//input[@id='credit_card_month_1']")).sendKeys("09");
			
			//year
			driver.findElement(By.xpath("//input[@id='credit_card_year_1']")).sendKeys("2029");
			
			//card holder name
			driver.findElement(By.xpath("//input[@name='payment_info[cardholder_name]']")).sendKeys("john");
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			driver.findElement(By.xpath("//input[@name='accept_terms']")).click();
			
			driver.findElement(By.xpath("//button[@id='litecheckout_place_order']")).click();
			Reporter.log("order placed successfully",true);
			
			
			
			
	   }	
	
	
	
	
	

}
