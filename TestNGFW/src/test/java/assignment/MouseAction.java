package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{
   
   static WebDriver driver;
       
        public static void main(String[] args) {
			
		
		
          // open chrome
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			// navigate to url
			driver.navigate().to("https://jqueryui.com/");
			
        	Actions actions = new Actions(driver);
        	WebElement support = driver.findElement(By.xpath("//ul[@class='links l_tinynav1']/child::li[4]"));
        	actions.moveToElement(support).build().perform();
        
		}  
} 
       

