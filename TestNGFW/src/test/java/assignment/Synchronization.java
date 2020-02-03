package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Synchronization
{
	static WebDriver driver;
	    

  public static void main(String[] args) {
	
         driver = new ChromeDriver();  
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
		driver.manage().window().maximize();

		// navigate to url
		driver.navigate().to("https://www.facebook.com/");
	
   	 WebElement firstName= driver.findElement(By.xpath("//input[@id=\'u_0_m\']"));
   	 WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));

   	WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='u_0_r']"));
   	WebElement newPassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
 	WebElement radio_button=driver.findElement(By.xpath("//input[@id=\"u_0_a\"]"));
   	WebElement signUp_button=driver.findElement(By.xpath("//button[@id=\"u_0_13\"]"));
   	//WebElement popup_button=driver.findElement(By.xpath("//button[@value=\"1\"]"));
  
   	
   	takeSomeTime(driver, firstName, 5, "Amit");
   	takeSomeTime(driver, lastName, 5, "Tomar");
   	takeSomeTime(driver, mobileNumber, 5, "8223012821");
   	takeSomeTime(driver, newPassword, 3, "8223012824");
 	clickOn(driver, radio_button, 5);
   	clickOn(driver, signUp_button, 4);
   	
   	
  }
    public static void takeSomeTime(WebDriver driver, WebElement element, int timeOut, String value) 
    {
    	WebDriverWait wait=new WebDriverWait(driver, timeOut);
    	wait.until(ExpectedConditions.visibilityOf(element));
    	element.sendKeys(value);
		//new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element));
		//element.sendKeys(value);
	}
    
    public static void clickOn(WebDriver driver,WebElement element, int timeout)
    {
    	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
    	element.click();
    }
}
