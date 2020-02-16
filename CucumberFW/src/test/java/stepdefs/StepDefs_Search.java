package stepdefs;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import di.ScnCntxt;
import utils.JavaScriptUtils;


public class StepDefs_Search {
//	private static final Logger LOG = LogManager.getLogger(StepDefs_Search.class);
	ScnCntxt context;

	public StepDefs_Search(ScnCntxt cntxt) {
		this.context = cntxt;
	}

	@When("I Search the Product {string}")
	public void search_product(String arg) {
		context.PO_CMN.SearchProduct(arg);
		context.SCN.write("Product name entered as " + arg + " and search button clicked");
//		LOG.info("Product successfully entered and searched with product as : " + arg);
	}

	@Then("Page is navigated to Search Page")
	public void page_is_navigated_to_Search_Page() {
		context.PO_CMN.ValidateSearchIsWorking();
		context.SCN.write("Page SUccessfully navigated to product search page");
	}
	
	@Then("scroll the page")
	public void scroll_the_page() throws InterruptedException {
		//Thread.sleep(5000);
		//JavaScriptUtils.flash(context.PO_CMN.txtbx_search, context.DRIVER);
		//context.SCN.write("js flash is successfully");
		Thread.sleep(5000);
		JavaScriptUtils.scrollPageDown(context.DRIVER);
		context.SCN.write("js scroll is successfully");

	}
	
	

}
