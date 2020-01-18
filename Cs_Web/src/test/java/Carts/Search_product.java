package Carts;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Search_product {
	
	@Test
	public void Product_search() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://demo.cs-cart.com");
		
		
		
		driver.findElement(By.xpath("//input[@id='search_input']"));
		WebElement Search_Box=driver.findElement(By.name("hint_q"));
		Search_Box.sendKeys("Computers");
		Search_Box.submit();
		Reporter.log("Search For Product as Computers",true);
		
		
		driver.findElement(By.xpath("//img[@id='det_img_212']")).click();
		Reporter.log("Search For Add to cart as ",true);
	
		
		
		driver.findElement(By.xpath("//button[@id='button_cart_212']")).click();
		Thread.sleep(6000L);		
		
		//search for mycart
		driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled']")).click();
        Reporter.log("search for my cart as",true);
        
        //search for viewcart
        driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
        Reporter.log("search for view cart as",true);
	    
        //proceed to checkout
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/a")).click();
        Reporter.log("search proceed to checkout as",true);
        
        
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
		
        
        
	}
	


}
