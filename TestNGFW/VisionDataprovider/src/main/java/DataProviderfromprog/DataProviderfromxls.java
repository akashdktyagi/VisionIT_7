package DataProviderfromprog;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderfromxls {
	WebDriver driver;

	WebElement uname;
	WebElement pass;
	WebElement btnlogin;
	String filepath = "C:\\Users\\Administrator\\eclipse-workspace\\VisionDataprovider\\userpwd.xls";

	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)");
		driver = new ChromeDriver();

		driver.get("http://demo.cs-cart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "logindataSupplier")
	public void checkloginScenario(String username, String password) {

		driver.findElement(
				By.xpath("//html//body//div[2]//div[4]//div[1]//div//div//div[3]//div//div[1]//a//i[2]" + "")).click();
		Reporter.log("Clicked on My Account <br>", true);

		driver.findElement(By.xpath("//*[@id=\"login_main_login\"]")).clear();
		uname = driver.findElement(By.xpath("//*[@id=\"login_main_login\"]"));
		uname.sendKeys(username);
		Reporter.log("Entered username <br>", true);

		driver.findElement(By.xpath("//*[@id=\"psw_main_login\"]")).clear();
		pass = driver.findElement(By.xpath("//*[@id=\"psw_main_login\"]"));
		pass.sendKeys(password);
		Reporter.log("E <br>", true);

		driver.findElement(
				By.xpath("/html/body/div[2]/div[4]/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button"))
				.click();
	}

	@DataProvider(name = "logindataSupplier")
	public Object[][] getlogintestdata() throws IOException {

		FileInputStream fis = new FileInputStream(filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();
		System.out.println("rowcoun : " + rowcount);

		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("no of cells" + cellcount);

		Object[][] testdata = new Object[rowcount][cellcount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {

				testdata[i][j] = sheet.getRow(i + 1).getCell(j).toString();

			}

		}

		return testdata;

	}
}
