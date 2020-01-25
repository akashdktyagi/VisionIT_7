package Dataprov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DataproviderDemo 
{
	WebDriver driver;
	WebElement Username;
	WebElement passwrd;
	WebElement btnlogin;
	//String filepath="F:\\VisionIT_7\\VisionIT_7\\TestNGFW\\src\\test\\java\\com_xls\\Excel1.xlsx";
	
  @BeforeMethod
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
  }
	
  @DataProvider(name="LoginTestData")
  public Object[][] getlogindata()
  {
	 Object[][] data=new Object[2][2];
	 data[0][0]="neha";
	 data[0][1]="pass1";
	 data[1][0]="vai";
	 data[1][1]="pass2";
	  
	  return data;
  }
	
  @Test(dataProvider="logindatasupplier")	
  public void checkloginsenario(String username,String password)
  {
	  Username=driver.findElement(By.xpath("//input[@name='username']"));
	  Username.sendKeys("username");
	  passwrd=driver.findElement(By.xpath("//input[@name='password']"));
	  passwrd.sendKeys("password");
	  btnlogin=driver.findElement(By.xpath("//input[@type='submit']"));
	  btnlogin.click();
	  
  }
  
  @DataProvider(name="logindatasupplier")
  public Object[][] getlogintestdata() throws IOException 
  
  {
	  FileInputStream fis=new FileInputStream("F:\\VisionIT_7\\VisionIT_7\\TestNGFW\\src\\test\\java\\com_xls\\Excel1.xlsx");
	  
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet=workbook.getSheetAt(0);
	  
	  int rowcount=sheet.getLastRowNum();
	  System.out.println("rowcoun : "+rowcount);
	  
	  int cellcount=sheet.getRow(0).getLastCellNum();
	  System.out.println("no. of cells"+cellcount);
	  
	  Object[][] testdata=new Object[rowcount][cellcount];
	  
	  for(int i=0;i<rowcount;i++)
	  {
		  for(int j=0;j<cellcount;j++)
		  {
			  testdata[i][j]=sheet.getRow(i+1).getCell(j).toString();
		  }
	  }
	  
	return testdata; 
	  
  }
  
}
