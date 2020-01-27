package com.guruwindowHandling;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class guru_window_handle_Demo 
	
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	
	{
		System.setProperty("webderiver.com.driver","C:\\Users\\Admin\\Downloads");
	    driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}
	@Test
	public void TestWindowHandle()
	{
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parentwindow: " +parentWindow);
		
		Set<String> allwin=driver.getWindowHandles();
		System.out.println("all window in current browser:" +allwin);
		
		java.util.Iterator<String> it=allwin.iterator();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		 
		
		
		
	}
		

}
