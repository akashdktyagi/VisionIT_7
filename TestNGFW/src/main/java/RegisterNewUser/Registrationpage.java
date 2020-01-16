package RegisterNewUser;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registrationpage {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com/stores/47484fdc335c14b1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}

	@Test

	public void registerNewUserWithAllDetails() {
		driver.findElement(By.xpath("//span[@class='hidden-phone']\r\n" + "")).click();
		Reporter.log("Clicked on My Account <br>", true);
		
		driver.findElement(By.xpath("//a[@class='ty-btn ty-btn__primary']\r\n" + "")).click();
		Reporter.log("Clicked on Register <br>,true");
		
		driver.findElement(By.xpath("//input[@name='user_data[firstname]']\r\n" + "")).sendKeys("Jay");
		Reporter.log("Firest Name Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@name='user_data[lastname]']")).sendKeys("Veer");
		Reporter.log("Last Name Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@name='user_data[phone]']")).sendKeys("1234523423");
		Reporter.log("Phone Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Jay.veer@gm.com");
		Reporter.log("Email Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("amp@123");
		Reporter.log("Password Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@name='user_data[password2]']")).sendKeys("amp@123");
		Reporter.log("Confirm Password Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@name='user_data[birthday]']")).sendKeys("12/12/1999");
		Reporter.log("Birth Date Added in Text Field <br>,true");
		
		driver.findElement(By.xpath("//input[@id='profile_mailing_list_1']")).click();
		Reporter.log("clicked on Tick <br>,true");
		
		//String captchaVal = JOptionPane.showInputDialog("Please Select the captcha & click on ");

		driver.findElement(By.id(
				"//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")).click();
		Reporter.log("Captcha added Successfully <br>,true");

		driver.findElement(By.xpath("//button[@class='ty-btn__secondary ty-btn']")).click();
		Reporter.log("Clicked on Registration Button <br>,true");
	}

}
