package interfaceManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseSetup.TestBase;



public class SelImplementation extends TestBase implements iManager{
	
	public static String AlertText=null;

	@Override
	public void setText(WebElement element,WebDriver driver, String Text) {
		
		try {
			element.sendKeys(Text);
		
		} catch (Exception e) {
		   e.getStackTrace();
		}
	
		
	}

	@Override
	public void clickOnElement(WebElement element, WebDriver driver) {
		
		try {
			element.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public String getText(WebElement element, WebDriver driver,String elementtext) 
	{
		
		try {
			String elementtext1=element.getText();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return  elementtext;
		
	}

	@Override
	public String getalerttext( WebDriver driver) 
	{
		
		try{
		Alert alert=driver.switchTo().alert();
		
		AlertText = alert.getText();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		
		return AlertText;
	
	}

}
