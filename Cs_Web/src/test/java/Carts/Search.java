package Carts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Search {

	
	
	
	 @Test
	  public void signin() throws InterruptedException
	 {
		//get URL  
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://demo.cs-cart.com");
	    
	    //sign in
	    WebElement MyAccount=driver.findElement(By.xpath("//a[@class='ty-account-info__title']"));
	    MyAccount.click();
	    driver.findElement(By.xpath("//a[contains(text(),'Sign in')and @data-ca-target-id='login_block4']")).click();
		driver.findElement(By.xpath("//button[@type='submit' and @name='dispatch[auth.login]']")).click();
	    Reporter.log("sign in");
		
	    //search product
		driver.findElement(By.xpath("//input[@type='text' and @id='search_input']"));
		WebElement SearchProd=driver.findElement(By.name("q"));
		SearchProd.sendKeys("laptop");
		driver.findElement(By.xpath("//button[@title='Search' and @type='submit']")).click();
		Reporter.log("Product searched");
		
		//select product
		driver.findElement(By.xpath("//*[@id=\"icons_76\"]/div[1]/div/div[1]/div/a"));
		WebElement Product=driver.findElement(By.xpath("//form[@name='product_form_76']"));
		Product.click();
		Reporter.log("Product selected");
		
		//increase quantity of item
		WebElement Quantity=driver.findElement(By.xpath("//a[@class='cm-increase ty-value-changer__increase']"));
	    Quantity.click();
	    Quantity.click();
		Reporter.log("quantity increased");
		
		
		//add to cart
		driver.findElement(By.xpath("//button[@id='button_cart_76']")).click();
		Thread.sleep(5000L);
		Reporter.log("product add to cart");
		
		//My cart
		driver.findElement(By.xpath("//div[@class='ty-dropdown-box__title cm-combination']")).click();
		
		//View cart
		driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
		Reporter.log("view my cart");
		
		//checkout
		driver.findElement(By.xpath("//*[@id=\"checkout_form\"]/div[1]/div[2]/a")).click();
		Reporter.log("checkout");
		
		//enter card number
		driver.findElement(By.xpath("//input[@id='credit_card_number_1']")).sendKeys("4444333322221111");
		Reporter.log("enter card detials");
		
		//enter cvv
		driver.findElement(By.xpath("//input[@id='credit_card_cvv2_1']")).sendKeys("233");
			
		//enter month
		driver.findElement(By.xpath("//input[@id='credit_card_month_1']")).sendKeys("12");
		
		//enter year
		driver.findElement(By.xpath("//input[@id='credit_card_year_1']")).sendKeys("22");
		
	    //enter name
		driver.findElement(By.xpath("//input[@id='credit_card_name_1']")).sendKeys("Neha Dhande");
		
		//click checkbox
		driver.findElement(By.xpath("//input[@id='id_accept_terms5e18b1e15e77e' and @name='accept_terms']")).click();
		Reporter.log("click on check box");
		
		//place order
		//driver.findElement(By.xpath("//button[@class='litecheckout__submit-btn ']")).click();
		//Reporter.log("Order placed");
		
	 }
	  
}
