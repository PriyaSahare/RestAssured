package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SdAssign3 {
	Response response;
	RequestSpecification httpRequest;
	
	@Given("URI")
	public void uri() {
		System.out.println("Given Started");
		RestAssured.baseURI = "https://reqres.in/";
		System.out.println("Given Ended");
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("Giving EndPoints")
	public void giving_end_points() {
		System.out.println("When Started");
		response = RestAssured.get("/api/users/2");
		System.out.println("When Started");
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Validating TWO Response Code")
	public void validating_two_response_code() {
		System.out.println("Then Started");
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getContentType(),"application/json; charset=utf-8");
		
		System.out.println("Then Started");
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
}
