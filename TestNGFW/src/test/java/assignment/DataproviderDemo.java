package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataproviderDemo {
	WebDriver driver;
	WebElement uname;
	WebElement pass;
	WebElement btnlogin;
	static String filepath="E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\testdata\\LoginWorkbook.xlsx";
	
	

	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Vision_B_01_proj\\VisionIT_7\\TestNGFW\\src\\test\\java\\com\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
	@DataProvider(name="LoginTestData")
	public Object[][] getlogindata(){
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="rahul";
		
		data[0][1]="pass";
		
		data[1][0]="neha";
		data[1][1]="pass2";
		
		return data;
		
		
	}
	//@Test(dataProvider="logindataSupplier")
	@Parameters({"uname","pass"})
	@Test
	public void checkloginScenario(String uname,String pass){
		
		this.uname=driver.findElement(By.xpath("//*[@name='username']"));
		this.uname.sendKeys(uname);
		this.pass=driver.findElement(By.xpath("//*[@name='password']"));
		this.pass.sendKeys(pass);
		btnlogin= driver.findElement(By.xpath("//*[@value='Log In']"));
		btnlogin.click();	
		
		
		
	}
	
	@DataProvider(name="logindataSupplier")
	public static Object[][] getlogintestdata(String sheetname) throws IOException{
		
		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet(sheetname);
		
		int rowcount=sheet.getLastRowNum();
		System.out.println("rowcoun : " +rowcount);
		
		int cellcount=sheet.getRow(0).getLastCellNum();
		System.out.println("no of cells"+cellcount);
		
		Object[][] testdata=new Object[rowcount][cellcount];
		
		for(int i=0 ;i<rowcount ;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				
			testdata[i][j]= sheet.getRow(i+1).getCell(j).toString();
			
						
			}
				
		}
		
		
		return testdata;
		
		
	}
	
	@Test
	public void checkDp1() {
		
		
		
		
	}
	
	@Test
	public void checkDp2() {
		
		
		
		
	}

	
	
	
	
	

}
