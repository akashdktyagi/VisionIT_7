package csCartScreenshot;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotofCS {

	public static WebDriver driver;
	public static String filepath = "C:\\Users\\Administrator\\eclipse-workspace\\Screenshot\\cscart.png";

	public static void main(String args[]) throws IOException {

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// Interface
		TakesScreenshot srcshot = ((TakesScreenshot) driver);

		java.io.File srcfile = srcshot.getScreenshotAs(OutputType.FILE);

		// getScreenshotAs capture image of perticular window

		File destfile = new File(filepath);

		FileUtils.copyFile(srcfile, destfile);

	}

}