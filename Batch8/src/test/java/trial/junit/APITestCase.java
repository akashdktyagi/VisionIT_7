package trial.junit;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class APITestCase {

	String server_name ="http://dummy.restapiexample.com";
	@Test
	public void t_01_get_request() {
		
		given().baseUri("http://dummy.restapiexample.com").
		when().get("/api/v1/employees").
		then().
		assertThat().statusCode(200).
		assertThat().body("status",equalTo("success")).
		assertThat().body("data[0].id",equalTo("1")).
		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));
		
	}
	
	@Test
	public void t_02_get_request_breaking_steps() {
		
		RequestSpecification req_spec = given().baseUri(server_name);
		Response response = req_spec.when().get("/api/v1/employees");
		ValidatableResponse valid_response = response.then();
		valid_response.assertThat().statusCode(200).
		assertThat().body("status",equalTo("success")).
		assertThat().body("data[0].id",equalTo("1")).
		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));
		
	}
	@Test
	public void t_03_get_request_get_single_employee_detail() {
		RequestSpecification req_spec = given().baseUri(server_name);
		Response response = req_spec.when().get("/api/v1/employee/1");
		ValidatableResponse valid_response = response.then();
		valid_response.assertThat().statusCode(200).
		assertThat().body("status",equalTo("success")).
		assertThat().body("data[0].id",equalTo("1")).
		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));
	}
	
	@Test
	public void t_04_get_request_get_incorrect_employee_detail() {
		RequestSpecification req_spec = given().baseUri(server_name);
		Response response = req_spec.when().get("/api/v1/employee/45644454646645654645646egeg");
		ValidatableResponse valid_response = response.then();
		//To be validated. Need to check status code and Json message 
		//with text as Data Not Found.
		Assert.assertTrue("Validation yet to be written, untill then marked as fail", false);
//		valid_response.assertThat().statusCode(200).
//		assertThat().body("status",equalTo("success")).
//		assertThat().body("data[0].id",equalTo("1")).
//		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));
	}
	
	@Test
	public void t_03_get_request_get_incorrect_employee_detail() {
		RequestSpecification req_spec = given().baseUri(server_name);
		Response response = req_spec.when().get("/api/v1/employee/45644454646645654645646egeg");
		ValidatableResponse valid_response = response.then();
		//To be validated. Need to check status code and Json message 
		//with text as Data Not Found.
		Assert.assertTrue("Validation yet to be written, untill then marked as fail", false);
//		valid_response.assertThat().statusCode(200).
//		assertThat().body("status",equalTo("success")).
//		assertThat().body("data[0].id",equalTo("1")).
//		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));
	}
	
	@Test
	public void t_04_post_postive_create_new_employee() {
		String body_text = "{\"name\":\"Akash Tyagi\",\"salary\":\"123\",\"age\":\"23\"}";
		
		HashMap<String,String> hm_header = new HashMap<String,String>();
		hm_header.put("Content-Type", "application/json");
		
		RequestSpecification req_spec = given().baseUri(server_name).headers(hm_header);
		Response response = req_spec.when().body(body_text).post("/api/v1/create");
		ValidatableResponse valid_response = response.then();
		
		
		valid_response.assertThat().body("status",equalTo("success")).
		assertThat().body("data[0].name",equalTo("Akash Tyagi")).
		assertThat().body("data[0].salary",equalTo("123")).
		assertThat().body("data[0].age",equalTo("23"));
		System.out.println(response.asString());
		
		//another validation to check id
		String id = "";
		given().baseUri("http://dummy.restapiexample.com").
		when().get("/api/v1/employee/").
		then().
		assertThat().statusCode(200).
		assertThat().body("status",equalTo("success")).
		assertThat().body("data[0].id",equalTo("1")).
		assertThat().body("data[0].employee_name",equalTo("Tiger Nixon"));

		//{"status":"success","data":{"name":"Akash Tyagi","salary":"123","age":"23","id":60}}
	}
	
	
	
}
