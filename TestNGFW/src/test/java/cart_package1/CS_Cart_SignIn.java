package cart_package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CS_Cart_SignIn 
{
	@Test
	public void Cs_Sign_In() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().to("http://demo.cs-cart.com/stores/1e43a487301cc04f/");
		//driver.navigate().to("http://demo.cs-cart.com/stores/0f4816803a4a2590/");
		driver.navigate().to("http://demo.cs-cart.com/stores/4d3d0858f800771a/");
		Reporter.log("URL Open <br>",true);
		//My Account
		driver.findElement(By.xpath("//*[@id='sw_dropdown_4']/a/span")).click();
		
				
		//SignIn button
		driver.findElement(By.xpath("//*[@id='account_info_4']/div[2]/a[1]")).click();
		Reporter.log("Successfully sign in <br>",true);
		
		
		//Remember
		driver.findElement(By.xpath("//input[@id='remember_me_popup4']")).click();
		Reporter.log("Remember checkbox successfully <br>",true);
		//Click onSignIn
		driver.findElement(By.xpath("//button[@ class='ty-btn__login ty-btn__secondary ty-btn']")).click();
		Reporter.log("Click on Sign In successfully <br>",true);
		
		//Search Product
		//driver.findElement(By.xpath("//input[@type='text' and @ title='Search product']")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/input[8]")).click();
		driver.findElement(By.xpath("//input[@name='hint_q']"));
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Mobile");
		searchbox.submit();
		Reporter.log("Search product success <br>",true);
		
		//Click on Product
		driver.findElement(By.xpath("//*[@id='icons_73']/div[1]/div/div[1]/div/a"));
		WebElement product=driver.findElement(By.xpath("//form[@name='product_form_73']"));		
		product.click();
		Reporter.log("Click on product success <br>",true);
		
		//Add to cart
		driver.findElement(By.xpath("//button[@name='dispatch[checkout.add..73]']")).click();
		Reporter.log("Add to cart success <br>",true);
		Thread.sleep(6000);	
		
		//Click on my cart
		//driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled']")).click();		
		//driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
		driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled'")).click();
		

		
		
		
	}
}
