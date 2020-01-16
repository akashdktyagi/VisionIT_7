package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestClassForTrail {

	public static void main(String[] args) {
		@BeforeMethod
		public void setup() {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
			driver = new ChromeDriver();
			driver.get("http://demo.cs-cart.com/stores/9884709f8faba2bc/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		}

	}

}
