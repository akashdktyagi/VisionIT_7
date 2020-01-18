package testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	public static WebDriver driver;
	public static String filepath="D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\report\\cscart.png";
	
	
	public static void main(String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        TakesScreenshot srcSot=((TakesScreenshot)driver);
        
        File srcfile=srcSot.getScreenshotAs(OutputType.FILE);
        
        File destfile=new File(filepath);
        
        FileUtils.copyFile(srcfile,destfile );
        
        
        
        
        
        
        
        
        
		
		
		
	}
	
	
	
	

}
