package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SdAssign5 {
	 Response response;
	 
	  @Given("API for foreign exchange one")
	  public void api_for_foreign_exchange_one() {
	 
	  RestAssured.baseURI="https://reqres.in";
	  }
	 
	  @When("posted with incorrect Information")
	  public void posted_with_incorrect_information() {
	  response= RestAssured.get("/api/users/23");
	 
	  }
	 
	  @Then("validate negative response code received")
	  public void validate_negative_response_code_received() {
	 
	  System.out.println(response.getStatusLine());
	  Assert.assertEquals(404,response.getStatusCode());
	  }
	  public static void main(String args[]) {
	  Response response =
	  RestAssured.given().log().all()
	  .header("Content-Type", "application/json")
	  .when().get("https://reqres.in/api/users/23")
	  .then().log().all().statusCode(404).extract().response();
	  Assert.assertEquals(404,response.getStatusCode());
	  System.out.println("Status code is "+ response.getStatusCode());
	 
	 
	 }
}
