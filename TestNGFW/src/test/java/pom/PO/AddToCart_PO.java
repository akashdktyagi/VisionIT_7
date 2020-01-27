package pom.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart_PO 
{
    private WebDriver driver;
   
   @FindBy(xpath="//input[@class='search_query form-control ac_input']")
	WebElement searchBox;
   
   @FindBy(xpath="//button[@name='submit_search']")
  	WebElement searchIcon;
   
   @FindBy(xpath="//img[@class='replace-2x img-responsive' and @width='250']")
 	WebElement product;
   
   @FindBy(xpath="//button[@name='Submit']")
 	WebElement addToCartButton;
   
   //Action
   
   public void enterProduct()
   {    
	   searchBox.click();
	   searchBox.sendKeys("T-SHIRT");
	   searchIcon.click();
   }
   
   public void addToCartProduct()
   {
	   product.click();
	   addToCartButton.click();
   }
  

}
