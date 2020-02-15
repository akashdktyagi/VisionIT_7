package stepdefs;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
WebDriver driver = null;
Scenario scn;

@Before
public void beforeMethodSeUp(Scenario s) {
	this.scn =s;
}
@Given("I open a {string} browser")
public void i_open_a_chrome_browser(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		scn.write("chrome Browser id opened");
	}else if (browser.equalsIgnoreCase("firefox")) {
		scn.write("Firefox Browser id opened");
		//driver = new FireFox();
	}
	
	driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
}

@Given("I navigate to URL {string}")
public void i_navigate_to_URL(String url) {
   
	driver.get(url);
	scn.write("User Navigated to url" + url);
}

@When("I enter text {string} in Search box")
public void i_enter_text_in_Search_box(String string) {
    driver.findElement(By.name("q")).sendKeys(string);
    scn.write("Product name entered:"+ string);
    
}

@When("I click on submit Button")
public void i_click_on_submit_Button() {
	 driver.findElement(By.xpath("//button[@title='Search']")).click();
	    scn.write("Submit Button Clicked");
}


@Then("page is navigate to search page")
public void page_is_navigate_to_search_page() {
	//validation 1
    String expected="Search Results";
    String actual= driver.getTitle();
    Assert.assertEquals(actual,expected);
    scn.write("page Title is validated. Expected:" +expected+ "actual:" + actual);
    
    //validation 2
   List<WebElement> collection = driver.findElements(By.xpath("//img(starts-with(@id,'del_img_'))"));
   
    if(collection.size()>0) {
    	
    	Assert.assertTrue(true);
    	scn.write("Search Result are displayed. Search Product Count:" +collection.size());
    
    }else {
    	scn.write("Search Result are displayed.No products are returned");
    	Assert.assertTrue(false);
    }
    		}



}
