package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrshot_demo 
{

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	
		driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TakesScreenshot scrshot=((TakesScreenshot)driver);
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		File destfile=new File("F:\\VisionIT_7\\VisionIT_7\\TestNGFW\\src\\test\\java\\screenshot\\src.png");
		FileUtils.copyFile(srcfile,destfile );
		
		
	}
	

}
