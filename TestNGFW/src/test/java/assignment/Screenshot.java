package assignment;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PO.WebDriver;

import screenshot.FileUtils;

public class Screenshot {
	WebDriver driver;
	@Test
	 public void TestJavaS1()
	{
	// Open Firefox
	WebDriver driver=new ChromeDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
	 
	// Pass the url
	driver.get("http://demo.cs-cart.com/stores/7d44b576c65d60e5/");
	 
	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:\\Users\\user\\eclipse-workspace\\temp\\error.png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
	 }

}
