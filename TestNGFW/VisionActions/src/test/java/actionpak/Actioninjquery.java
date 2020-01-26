package actionpak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actioninjquery {
	static WebDriver driver;

	@BeforeMethod
	public void setup() {
		//System.setProperty("Webdriver.crome.driver", value)
	driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
@Test
public  void actionOnDrop() throws InterruptedException {
	WebElement droppableclick=driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/droppable/\"]"));
	droppableclick.click();
	
	driver.switchTo().frame(0);
	WebElement draggable= driver.findElement(By.xpath("//html[@lang=\"en\"]/descendant::div[@id='draggable']")); 
	WebElement droppable= driver.findElement(By.xpath("//body/div[1][@id=\"draggable\"]//following-sibling::div[@id='droppable']"));
	Actions action=new Actions(driver);
	action.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
	//action.dragAndDrop(draggable, droppable).build().perform();
	
	
}
}
