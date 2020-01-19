package DataProviderfromprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderprac {
	WebDriver driver;
	WebElement uname;
	WebElement pass;
	WebElement btnlogin;
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}
@DataProvider(name="LoginData")
public Object[][] getLoginData(){
		
	Object[][] data=new Object[2][2];
	data[0][0]= "Ram";
	data[0][1]="Ram123";
	data[1][0]= "Sham";
	data[1][1]="sham123";
	
	return data;
									
}
	@Test(dataProvider="LoginData")
	public void singinwithdifferntusernamesAndPasswords(String username, String password) {
		driver.findElement(By.xpath("//html//body//div[2]//div[4]//div[1]//div//div//div[3]//div//div[1]//a//i[2]" + "")).click();
		Reporter.log("Clicked on My Account <br>", true);
		
		//driver.findElement(By.xpath("//a[@class='cm-dialog-opener cm-dialog-auto-size ty-btn ty-btn__secondary']")).click();
		//Reporter.log("Clicked on Sign In Button");
		driver.findElement(By.xpath("//*[@id=\"login_main_login\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login_main_login\"]")).sendKeys(username);
		Reporter.log("Entered username <br>", true);

		driver.findElement(By.xpath("//*[@id=\"psw_main_login\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"psw_main_login\"]")).sendKeys(password);
		Reporter.log("E <br>", true);

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")).click();
		
	
	}
}
