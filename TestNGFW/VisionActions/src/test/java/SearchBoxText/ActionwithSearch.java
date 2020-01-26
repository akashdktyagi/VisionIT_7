package SearchBoxText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionwithSearch {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		//System.setProperty("Webdriver.crome.driver", value)
	driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
@Test
public void shiftKeyActiononSearchBox() {
	WebElement searchbox=driver.findElement(By.xpath("//input[@name=\"s\"]"));
	//Actions action=new Actions(driver);
	 searchbox.sendKeys(Keys.SHIFT,"textEnter");
	
}
}
