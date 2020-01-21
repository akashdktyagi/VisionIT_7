package Window_Handling_SS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ScreenShot_Example 
{
	public static WebDriver driver;
	public void SrcSHot() throws IOException
	{
		String filepath="C:\\Users\\Shubham\\eclipse-workspace\\Automation_Testing\\facebook.jpeg";
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ss =((TakesScreenshot)driver);
		//convert driver into interphase
		File SrcFile=ss.getScreenshotAs(OutputType.FILE);
		//to copy filepath: "FileUtils"
		File DestFile=new File(filepath);
		FileUtils.copyFile(SrcFile, DestFile);
		driver.close();
	}
}
