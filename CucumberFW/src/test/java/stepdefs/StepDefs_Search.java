package stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import di.ScnCntxt;
import po.PO_Cmn;
import utils.Cmn;

//Task: Add Assert J lib/assertion

public class StepDefs_Search {
	ScnCntxt context;

	public StepDefs_Search(ScnCntxt cntxt) {
		this.context = cntxt;
	}

	@When("I Search the Product {string}")
	public void search_product(String arg) {
		context.PO_CMN.SearchProduct(arg);
		context.SCN.write("Product name entered as " + arg + " and search button clicked");
	}

	@Then("Page is navigated to Search Page")
	public void page_is_navigated_to_Search_Page() {
		context.PO_CMN.ValidateSearchIsWorking();

		
	}
	


}
