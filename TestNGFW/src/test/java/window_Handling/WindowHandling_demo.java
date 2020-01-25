package window_Handling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandling_demo {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
	
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
	@Test
	public void HandledWindow()
	{
		driver.findElement(By.linkText("Click Here")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window= "+parentwindow);
		
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println("All window in current browser= "+allwindow);
		
	    Iterator<String> itr=allwindow.iterator();
		String childwindow=itr.next();
		driver.switchTo().window(childwindow);
		driver.switchTo().window(childwindow);
	    
	}
		
}
