package MouseHoverMove;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover
{

	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		//System.setProperty("Webdriver.crome.driver", value)
	driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

}
	
	@Test
	public void performMouseActions()
	{
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://contribute.jquery.org/']"))).build().perform();
		
	}
}