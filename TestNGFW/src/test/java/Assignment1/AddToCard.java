package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCard {
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		//launch 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
	@Test
	public void search()
	{
		//product name
		WebElement Enter =driver.findElement(By.xpath("//input[@name='hint_q']"));
		Enter.sendKeys("laptop");
		//click on search icon
		WebElement search=driver.findElement(By.className("ty-icon-search"));
		search.click();
		//product click
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement clicks=driver.findElement(By.xpath("//form[@name='product_form_229']"));
		clicks.click();
		//click on add to card
		WebElement Add=driver.findElement(By.id("button_cart_229"));
		Add.click();
		//display value on console
		String Price=driver.findElement(By.className("ty-product-block__price-actual")).getText();
		//Assert.assertEquals( Price.isDisplayed(),true);
		Reporter.log("Display"+Price,true);
		
	}
      
}


