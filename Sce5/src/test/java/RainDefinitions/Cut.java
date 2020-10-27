package RainDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Cut {
	Response response;

	@Test
	@Given ("API for foreign exchange")
	 public void  api_for_foreign_exchange(){
		RestAssured.baseURI="https://api.ratesapi.io";
		
		
	}
	@Test
	@When("posted with correct information")
	public void posted_with_correct_information(){
		response = RestAssured.get("/api");
		
	}
	@Test
	@Then("validate positive response object")
	public void validate_positive_response_object(){
		System.out.println(response.getStatusCode());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode,400);
		Assert.assertTrue(statusCode!=200);
		
	}
}
