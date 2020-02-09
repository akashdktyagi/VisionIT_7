package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseSetup.TestBase;

public class Utility extends TestBase {
	
	public static String filepath_srcFile="E:\\QaWork\\Guru99\\src\\main\\java\\testScreenShots";
	
	
  public  static void  TakescrenShot()
  {
	  
	  Date d=new Date();
      SimpleDateFormat sd=new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
      String timestamp=sd.format(d);
      
      
      filepath_srcFile=filepath_srcFile+"\\"+timestamp+".png";
	  
      System.out.println(filepath_srcFile);
	  
     // String filename = Thread.currentThread().getStackTrace()[1].toString();
      
     // System.out.println("Filepath with Thread :" + filename);

	  
	  
	  TakesScreenshot srcchot=(TakesScreenshot)driver;
	  
	File Srcfile = srcchot.getScreenshotAs(OutputType.FILE);
	File destFile= new File(filepath_srcFile);
	 
	 System.out.println(filepath_srcFile);
	
	try {
		FileUtils.copyFile(Srcfile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
  }
  
  public void clickOnElementWithJavaScriptExecutor(WebElement element)
  {
	
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  try {
		  js.executeScript("arguments[0].click();", element);	
	}
	  catch (Exception e) 
	  {
       e.printStackTrace();
       //System.out.println(e);
	}
	  
	  
	  
	  
  }
  
  public static void checkAlertisPresent()
  {
	  try{
	  WebDriverWait wait= new WebDriverWait(driver, 20);
	  
	  if( wait.until(ExpectedConditions.alertIsPresent()) != null){
		 
		  System.out.println("Alert is present");}
		  else
		  {
			  System.out.println("Alert is not present");
			  }
	  }
	  catch(Exception e){
		  
	  	  
	  e.printStackTrace();
		  
	  }
	  
	  
	  
	  
  }
  
  
  
 
}


