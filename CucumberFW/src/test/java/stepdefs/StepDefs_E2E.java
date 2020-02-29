package stepdefs;

import java.util.HashMap;
import java.util.List;

import cucumber.api.java.en.When;
import di.ScnCntxt;

public class StepDefs_E2E {
	private ScnCntxt context;
	
	public StepDefs_E2E(ScnCntxt cntxt) {
		this.context = cntxt;
	}
	
	/*
	 *   |   CODE   | Quantity|
		  |H0217E3OE9|  5      |
		  |F01262AH0T|  6      |
	 */
	@When("I search and add products")
	public void i_search_and_add_products(List<HashMap<String,String>> list1) {
		//dataTable.as
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		String code = list1.get(0).get("CODE");
		String quantity = list1.get(1).get("Quantity");
		context.SCN.write("Code and quantity sent as " + code + " quanitity: " + quantity );
	}

	@When("I Check out")
	public void i_Check_out() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	

}
