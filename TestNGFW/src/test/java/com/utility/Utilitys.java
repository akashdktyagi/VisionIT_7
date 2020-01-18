package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utilitys {
	public static WebDriver driver;
	public static FileInputStream fis = null;
    public static Properties prop= null;
    public static String filepath="D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\config.properties";
     	
	
	public static void initilizeBrowser() throws IOException 
	{
 
 		fis=new FileInputStream(filepath);
 		prop=new Properties();
 		prop.load(fis);
 		
		String browserName=prop.getProperty("browsername");
		System.out.println("BrowserName =" +browserName);

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("gicko"))
		{
			System.setProperty(prop.getProperty("gickodrivername"),prop.getProperty("gickodriverpath"));
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			
			
		}
	
		driver.get("http://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	 public static void  takeScreenShot() throws IOException
	   {
		
		TakesScreenshot srcshot= ((TakesScreenshot)driver);
		
		File Srcshotfile= srcshot.getScreenshotAs(OutputType.FILE);
		
		//once we have scrshot_file we can copy this file in any destination file folder
		
		File destfile= new File("D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\report\\cscart.png");
		
		FileUtils.copyFile(Srcshotfile, destfile);
	

}
}