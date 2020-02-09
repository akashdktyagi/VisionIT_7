package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.Utilitys;

public class ScreenshotDemo {
	
	public static WebDriver driver;
	//public static String filepath="D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\report\\cscart.png";
	ExtentReports extent;
	ExtentTest Extlogger;
	
	
	
	@Test
	public void TestExtentReportOne()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
	}
	
	
	@Test
	public void TestExtentReportTwo()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demo.cs-cart.com/");
        
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
	}
	
	
	
	
	@BeforeTest
	public void ExtentReportSetup()
	{
        String extentreppath=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".html";
        
        ExtentHtmlReporter reporter=new ExtentHtmlReporter(extentreppath);
        
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		Extlogger=extent.createTest("ExtentTest");
				
	}
	
	@AfterTest
	public void EndTest()
	{
		extent.flush();
	
	}
	
	
	@AfterMethod
	public void afterTestExecution(ITestResult itestresult) throws IOException
	{
		if(itestresult.getStatus()==ITestResult.SUCCESS)
		{
			//extenttest.log(Status.PASS, "TEST CASE FAILED IS "+itestresult.getName());
			
			String srcshotPath= ScreenshotDemo.TestScreenShot();
			
			Extlogger.addScreenCaptureFromPath(srcshotPath);
			 
			Extlogger.log(Status.PASS, "TEST CASE IS  PASS" +  itestresult.getName());
			Extlogger.assignCategory("Smoke");
			Extlogger.assignAuthor("executed by sachin");
			
			 
			 
				
			
			
		}
	}
	
	
	
	
	
	//@Test(invocationCount=2)
	public static String TestScreenShot() {
		
		
        TakesScreenshot srcSot=((TakesScreenshot)driver);
        
        File srcfile=srcSot.getScreenshotAs(OutputType.FILE);
        
        
        String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
        
        File destfile=new File(path);
        
        try {
			FileUtils.copyFile(srcfile,destfile );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return path;
        
        
        
	  
        
        
        
		
		
		
	}
	
	
	
	

}
