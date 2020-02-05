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

public class StepDefs_SetUp {
	ScnCntxt context;

	public StepDefs_SetUp(ScnCntxt cntxt) {
		this.context = cntxt;
	}

	@Before
	public void beforeMethodSetUp(Scenario s) {
		context.SCN = s;
	}
	
	@Given("I open a {string} browser")
	public void i_open_a_browser(String browser) {
		context.DRIVER = Cmn.getBrowser(browser);
		context.PO_CMN = PageFactory.initElements(context.DRIVER, PO_Cmn.class);
	}

	@Given("I navigate to URL {string}")
	public void i_navigate_to_URL(String url) {
		Cmn.NavigateToUrl(context.DRIVER, url);
		context.SCN.write("User Navigated to url: " + url);
	}

	


}
