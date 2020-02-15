package stepdefs;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import di.ScnCntxt;


//Task: Add Assert J lib/assertion

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
//		LOG.info("Page SUccessfully navigated to product search page");
		

	}
	


}
