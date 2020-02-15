package utils;

import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import di.ScnCntxt;


public class Cmn {
	
//	private static final Logger logger = LogManager.getLogger(Cmn.class);
	private ScnCntxt cntxt;
	public Cmn(ScnCntxt cntxt) {
		this.cntxt = cntxt;
	}
	public WebDriver getBrowser(String browser) {
		WebDriver driver=null;
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
//			logger.info("Chrome Browser is Invoked");
			cntxt.SCN.write("Chrome Browser is opened");
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
//			logger.info("Mozilla Browser is Invoked");
			cntxt.SCN.write("FireFox Browser is opened");
		}else {
//			logger.fatal("Browse mentioned is not in the list of Browser FW supports, Browser name passes: " + browser);
		}
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		return driver;
	}
	
	public void NavigateToUrl(WebDriver driver,String url) {
		driver.get(url);
		cntxt.SCN.write("Browser Navigated to URL: " + url);
	}
}
