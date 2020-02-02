package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cmn {

	public static WebDriver getBrowser(String browser) {
		WebDriver driver=null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			//scn.write("Chrome Browser is opened");
		}else if (browser.equalsIgnoreCase("firefox")) {
			//driver = new FireFox();
			//scn.write("FireFox Browser is opened");
		}
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		return driver;
	}
	
	public static void NavigateToUrl(WebDriver driver,String url) {
		driver.get(url);
	}
}
