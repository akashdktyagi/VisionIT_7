package baseSetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utility.Constant;
import utility.Log4jlogger;

public class TestBase 
{
	protected static WebDriver driver;
	
	public static Logger log;
	public static FileInputStream fis= null;
	public static Properties prop=null;
	
	
	
	
	
	public TestBase() {
		
		 try {
			   
			   PropertyConfigurator.configure("Log4j.properties");
				fis= new FileInputStream(Constant.propfilepath);
				Log4jlogger.info("properties file open");
				prop= new Properties();
				try {
					prop.load(fis);
				Log4jlogger.info("file loaded and ready to ue");	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 Log4jlogger.debug("failed to read file");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void  BrowserIntilization()
	{
		
		///this continues integration
		
		///gitfccc
		
	   String browsername;
		browsername=prop.getProperty("browsername");
		//System.out.println("browser we are using"+browsername);
		
		Log4jlogger.info("Brower selected for test execution :" +browsername);
		
		if(browsername.equals("chrome"))
		{
			System.setProperty(prop.getProperty("chromedrivername"),prop.getProperty("chromebrowerpath"));
			
			driver= new ChromeDriver();
			
			Log4jlogger.info("chrome browser intilize successfully");
		}
		else if(browsername.equals("gicko"))
		{
			System.setProperty(prop.getProperty("gickodrivername"),prop.getProperty("gickodriverpath"));
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			
	        capabilities.setCapability("marionette", true);
	         
	         driver = new FirefoxDriver(capabilities);
	         
	         Log4jlogger.info("firefox brower intilize successfully");
		}
		
		
		
		driver.get(prop.getProperty("homeurl"));
		
		Log4jlogger.info("Appication Under Test lounch Succeesfully and ready to Test");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	

}
