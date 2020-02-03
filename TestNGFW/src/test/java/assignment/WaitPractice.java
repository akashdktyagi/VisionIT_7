package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {
	static WebDriver driver;
	
	public static void main(String[] args) {
	  
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

   // Start the application 
driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

//Click on timer so clock will start
driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

WebElement qtp=driver.findElement(By.xpath("//p[@id=\"demo\"]"));

  long timeOutInSeconds=5;
WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(qtp));
	System.out.println("this element is visible :" +qtp.isDisplayed());
	}

}
