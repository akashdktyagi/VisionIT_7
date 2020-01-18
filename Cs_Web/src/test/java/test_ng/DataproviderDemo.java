package test_ng;

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
import org.testng.annotations.Test;

public class DataproviderDemo {
	
	
	WebDriver driver;
	WebElement uname;
	WebElement pass;
	WebElement btnlogin;
	String filepath="E:\\v_batch_07\\Cs_Cart_TestNg_Proj\\src\\test\\java\\com\\testdata\\LoginWorkbook.xlsx";

	
	
	
	
	@BeforeMethod
	
	public void setup()
	{
			
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
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
	@Test(dataProvider="logindataSupplier")
	public void checkloginScenario(String username,String password){
		
		uname=driver.findElement(By.xpath("//*[@name='username']"));
		uname.sendKeys(username);
		pass=driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys(password);
		btnlogin= driver.findElement(By.xpath("//*[@value='Log In']"));
		btnlogin.click();	
		
		
		
	}
	
	@DataProvider(name="logindataSupplier")
	public Object[][] getlogintestdata() throws IOException{
		
		FileInputStream fis = new FileInputStream(filepath);
		
		DataproviderDemo workbook =new DataproviderDemo();
		
	    XSSFSheet sheet=workbook.getSheetAt(0);
		
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

	
}
