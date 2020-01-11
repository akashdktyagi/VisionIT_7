package cart_package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CS_Cart_Register 
{
	static WebElement dropMonth;
	static WebElement dropYear;
	@Test
	public void CsCart()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.cs-cart.com/stores/1e43a487301cc04f/");
		//My Account
		driver.findElement(By.xpath("//*[@id='sw_dropdown_4']/a/span")).click();
		//Register
		driver.findElement(By.xpath("//*[@id='account_info_4']/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='elm_6']")).sendKeys("Rutushree");
		driver.findElement(By.xpath("//*[@id='elm_7']")).sendKeys("Badwaik");
		driver.findElement(By.xpath("//*[@id='elm_9']")).sendKeys("+919370308982");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rutu.badwaik12@gmail.com");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("9403165322");
		//driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("9403165322");
		driver.findElement(By.id("password2")).sendKeys("9403165322");
		
		//DOB
		driver.findElement(By.xpath("//input[@id='birthday']")).click();
		//Enter Month
		dropMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select month =new  Select(dropMonth);
		month.selectByVisibleText("Dec");
		//Enter Year
		dropYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year =new Select(dropYear);
		year.selectByVisibleText("1993");
		//Enter Date
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[6]/a")).click();
		
		//RadioButton
		driver.findElement(By.xpath("//input[@id='profile_mailing_list_1']")).click();
		}
}
