package CSCartproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtoCartProduct {
	WebDriver driver;
	WebElement SearchProduct;

	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();
		driver.get("http://demo.cs-cart.com/stores/bb0963d5c24c5372/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}

	@Test
	public void searchProductAndaddintoCart() throws InterruptedException {
		// put product LED in Search field
		driver.findElement(By.xpath("//input[@title='Search products']")).sendKeys("LED");

		// Click on Search tab
		driver.findElement(By.xpath("//i[@class='ty-icon-search']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//img[@id=\"det_img_4\"]"));
		actions.doubleClick(elementLocator).perform();

		// Click on Add to Cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='ty-btn__primary ty-btn__big ty-btn__add-to-cart cm-form-dialog-closer ty-btn']"))
				.click();

		// Click on My Cart
		Thread.sleep(5000);
		Actions actions1 = new Actions(driver);
		WebElement elementLocator1 = driver
				.findElement(By.xpath("//span[@class='ty-minicart-title empty-cart ty-hand']"));
		actions1.doubleClick(elementLocator1).perform();

		// click on View Product
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//div[@class=\"cm-cart-buttons ty-cart-content__buttons buttons-container full-cart\"]//a[@href='http://demo.cs-cart.com/stores/85b4f7148c889aa4/cart/']"))
				.click();

		// Click on proceed to check Out
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Proceed to checkout'][position()=1]")).click();

	}

}