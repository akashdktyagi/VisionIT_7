package stepdefs;


import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import di.ScnCntxt;
import po.PO_Cmn;
import utils.Cmn;

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
		context.DRIVER = new Cmn(context).getBrowser(browser);
		context.PO_CMN = new PO_Cmn(context);//PageFactory.initElements(context.DRIVER, PO_Cmn.class);
	}

	@Given("I open a browser")
	public void i_open_browser_info_from_maven() {
		//this browser property will be fetched when we execute it from Maven
		System.out.println("browser: "+ System.getProperty("browser"));
		context.DRIVER = new Cmn(context).getBrowser(System.getProperty("browser"));
		context.PO_CMN = new PO_Cmn(context);
	}
	
	@Given("I navigate to URL {string}")
	public void i_navigate_to_URL(String url) {
		new Cmn(context).NavigateToUrl(context.DRIVER, url);
		context.SCN.write("User Navigated to url: " + url);
	}
	
	@Given("I navigate to env")
	public void i_navigate_to_env() {
		String urlEnv = System.getProperty("url");
		System.out.println("URL ENv: "+ urlEnv);
		new Cmn(context).NavigateToUrl(context.DRIVER, urlEnv);
		context.SCN.write("User Navigated to url: " + urlEnv);
	}

	


}
