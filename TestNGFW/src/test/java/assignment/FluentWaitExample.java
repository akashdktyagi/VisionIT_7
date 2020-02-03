package assignment;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample
{
   WebDriver driver;
public static void main(String[] args) throws InterruptedException {
 
           // Start browser
 
          WebDriver driver = new ChromeDriver();
 
           // Maximize browser
 
          driver.manage().window().maximize();
 
     // Start the application 
 
     driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
 
// Click on timer so clock will start
 
          driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
 
 
 
// Create object of FluentWait class and pass webdriver as input
 
          FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
 
 
          // Max time for wait- If conditions are not met within this time frame then it will fail the script
 
          wait.withTimeout(20, TimeUnit.SECONDS);
 

          // It should poll webelement after every single second

         wait.pollingEvery(2, TimeUnit.SECONDS);

 
 
       // we are creating Function here which accept webdriver and output as WebElement-
 
          WebElement element = wait.until(new Function<WebDriver, WebElement>() {
 
 
 
                // apply method- which accept webdriver as input
 
               public WebElement apply(WebDriver arg0) 
{
 
      // find the element
 
       WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
 
// Will capture the inner Text and will compare will WebDriver
 
// If condition is true then it will return the element and wait will be over
 
                     if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
                      {
 
                          System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
 
                          return ele;
 
                     }
 
// If condition is not true then it will return null and it will keep checking until condition is not true
 
else {
        System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
 
           return null;
 
       }
 
               }
 
          });
 
// If element is found then it will display the status
 
          System.out.println("Final visible status is >>>>> " + element.isDisplayed());
 
     }
 
}