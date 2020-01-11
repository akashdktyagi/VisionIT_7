package testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandleDemo {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
	
	@Test
	public void testSuccessHandleWindow(){
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent WIndow : " +parentWindow);
		
		Set<String>allwin=driver.getWindowHandles();
		 System.out.println("all window in cuurent browser"+allwin);
		 
		Iterator<String> it=allwin.iterator();
		String childwin= it.next();
		driver.switchTo().window(childwin);
	/*	WebElement verifyTitle=driver.findElement(By.xpath("//*[@title='Home']"));
		String title=verifyTitle.getText();
		System.out.println("msg" + title);*/
		//Assert.assertEquals(title, "");
		driver.switchTo().window(parentWindow);
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
	}
	
	
	
	

}
