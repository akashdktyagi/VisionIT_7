package com.guru_Alter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alter_Demo 
{
	WebDriver driver;
	WebElement customerid;
	WebElement buttonsumit;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testalter() throws InterruptedException
	{
		customerid=driver.findElement(By.name("cusid"));
		customerid.sendKeys("53920");
		buttonsumit=driver.findElement(By.name("submit"));
		buttonsumit.click();
		Alert alter=driver.switchTo().alert();
		String altermessage=alter.getText();
		System.out.println("Alter Message=" +altermessage);
		alter.accept();
		Thread.sleep(8000L);
		
	}
	@AfterMethod
	public void CloseWindow()
	{
		driver.close();
	}

}
