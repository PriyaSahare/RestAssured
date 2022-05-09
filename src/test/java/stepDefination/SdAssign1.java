package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SdAssign1 {
  Response response;
	@Given("URI and Endpoints")
	public void uri_and_endpoints() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		RestAssured.baseURI = "https://reqres.in/api";
	}

	@When("Provideing Endpoints")
	public void provideing_endpoints() {
		response = RestAssured.get("users?page=2");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println(response.getContentType());
	}

	@Then("Validating the Response Code")
	public void validating_the_response_code() {
		System.out.println(response.getStatusCode());
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
