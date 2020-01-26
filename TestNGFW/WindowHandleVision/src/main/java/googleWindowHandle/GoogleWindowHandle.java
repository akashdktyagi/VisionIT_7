package googleWindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleWindowHandle {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//System.setProperty("Webdriver.crome.driver", value)
	driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void testSuccessHandleWindow() {
		
		
		driver.findElement(By.linkText("Click Here")).click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		
		
		Set<String>allwin=driver.getWindowHandles();
		System.out.println("all window in current browser" +allwin);
		
		Iterator<String> it= allwin.iterator();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		driver.switchTo().window(parentWindow);
		
		
		
	}

}
