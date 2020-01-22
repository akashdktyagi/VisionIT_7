package guru99TakeScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99TakeScreenshot {
	public static WebDriver driver ;
	public static String filepath= "C:\\Program Files\\Git\\bin\\VisionIT_7\\test.jpg";
	@Test

    public void testGuru99TakeScreenShot() throws Exception{

		
    	
    	driver = new ChromeDriver();

        //goto url

        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Call take screenshot function

     //   this.takeSnapShot(driver, "c://test.png") ;     

    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot(WebDriver driver,String filepath) throws Exception{

        //Convert web driver object to TakeScreenshot


        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(filepath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
}
