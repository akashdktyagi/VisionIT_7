package junittest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;
import java.util.Random;
public class APITestCases {

	String url = "http://dummy.restapiexample.com/";
	
	@Test
	public void t_01_api_get_request() {
		
		Response response = given().baseUri(url).
		when().get("/api/v1/employees").andReturn();
		
		String body = response.asString();
		System.out.println("Body: " + body);
		//Assertion for Status Code
		int statusCodeActual = response.getStatusCode();
		int statusCodeExpected = 200;
		
		System.out.println("Status code returned: " + statusCodeActual);
		Assert.assertEquals(statusCodeExpected, statusCodeActual);
		
		//Assertion 2
		if (body.contains("success")) {
			System.out.println("TC passed. Body contains text as success." );
			Assert.assertTrue("TC passed",true);
			
		}else {
			System.out.println("TC Failed");
			Assert.assertTrue("TC failed",false);
		}
		
		//Assertion 3
		ValidatableResponse validatableResponse = response.then();
		validatableResponse.statusCode(200);
		validatableResponse.assertThat().body("status", equalTo("success"));
		validatableResponse.assertThat().body("data[0].employee_name", equalTo("Tiger Nixon"));
		
		//Get List of item using JsonPath
		List<Map> list = response.jsonPath().getList("data",Map.class);
		System.out.println(list.get(0).get("employee_name"));	
		
		//Find list of people with salary between a range
		//List<String> list1 = response.jsonPath().getList("data.findAll{data -> data.id='1'}");
		//System.out.println(list1.toString());	
		
	}
	
	//To get random Key
	public String GetRandomString(int n) {
		// lower limit for LowerCase Letters 
		int lowerLimit = 97; 

		// lower limit for LowerCase Letters 
		int upperLimit = 122; 

		Random random = new Random(); 

		// Create a StringBuffer to store the result 
		StringBuffer r = new StringBuffer(n); 

		for (int i = 0; i < n; i++) { 

			// take a random value between 97 and 122 
			int nextRandomChar = lowerLimit 
					+ (int)(random.nextFloat() 
							* (upperLimit - lowerLimit + 1)); 

			// append a character at the end of bs 
			r.append((char)nextRandomChar); 
		} 

		// return the resultant string 
		return r.toString(); 
	} 
}
