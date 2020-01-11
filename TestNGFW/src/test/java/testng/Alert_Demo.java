package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Demo {
	WebDriver driver;
	WebElement txtCustomerId;
	WebElement btnSubmit;
	
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
	@Test
	public void testSuccessAcceptAlert() throws InterruptedException{
		
		
		txtCustomerId=driver.findElement(By.name("cusid"));
		txtCustomerId.sendKeys("53920");
		
		btnSubmit=driver.findElement(By.name("submit"));
		btnSubmit.click();
		
		Alert alert= driver.switchTo().alert();
		String alertMessage=alert.getText();
		
		System.out.println("Alert Message = "  + alertMessage);
		
		alert.accept();
		
		Thread.sleep(5000);
		
		
	
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	@AfterMethod
	public void CloseWindow(){
		
		driver.close();
	}
	
	
	
	
	

}
