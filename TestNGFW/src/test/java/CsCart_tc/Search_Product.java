package CsCart_tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Search_Product 
{
	@Test
	public void Product_search() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Driver.get("http://demo.cs-cart.com/stores/e35ce5a3af2dc235/");
		Driver.findElement(By.xpath("//input[@id='search_input']"));
		WebElement Search_Box=Driver.findElement(By.name("hint_q"));
		Search_Box.sendKeys("Computers");
		Search_Box.submit();
		Reporter.log("Search For Product as Computers",true);
		Driver.findElement(By.xpath("//img[@id='det_img_212']")).click();
		Reporter.log("Search For Add to cart as ",true);
		Driver.findElement(By.xpath("//button[@id='button_cart_212']")).click();
		Thread.sleep(6000L);		
        Driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div[1]/a/i")).click();
        Reporter.log("search for my cart as",true);
        Driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__secondary']")).click();
        Reporter.log("search for view cart as",true);
	    Driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__primary ']")).click();
        Reporter.log("search proceed to checkout as",true);

	}
	

}
