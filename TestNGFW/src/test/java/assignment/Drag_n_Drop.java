package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Drag_n_Drop 
{
	 WebDriver driver;
     
     @BeforeMethod
     public void setup()
     {
		   // open chrome
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			// navigate to url
			driver.navigate().to("https://jqueryui.com/");
     }
	    @Test
     public void dragThis()
     {
     	
     	WebElement droplink = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/droppable/']"));
     	droplink.click();
     	driver.switchTo().frame(0);
    WebElement draggable= driver.findElement(By.xpath("//html[@lang=\"en\"]/descendant::div[@id='draggable']"));
    WebElement droppable = driver.findElement(By.xpath("//html[@lang=\"en\"]//child::body/child::div[2]"));
    Actions actions = new Actions(driver);
    actions.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
		}  
} 
    


	
	

