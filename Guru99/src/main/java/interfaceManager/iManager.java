package interfaceManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface iManager {
	
	
	public void setText(WebElement element,WebDriver driver,String Text);
	
	public void clickOnElement(WebElement element,WebDriver driver);
	
	public String getText(WebElement element,WebDriver driver,String elementtext);
	
	public String getalerttext( WebDriver driver);
	
	

}
