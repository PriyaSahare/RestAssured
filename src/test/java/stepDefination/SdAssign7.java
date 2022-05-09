package stepDefination;


	import org.json.simple.JSONObject;
	import org.testng.Assert;
	import static io.restassured.RestAssured.given;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;



	public class SdAssign7 {
	Response response;
	RequestSpecification httpRequest;
	@Given("Provide URI")
	public void provide_uri() {
	// Write code here that turns the phrase above into concrete actions
	//throw new io.cucumber.java.PendingException();
		System.out.println("Providing URI");
	RestAssured.baseURI = "https://www.reqres.in";
	System.out.println("Given Ended");

	}

	@When("Enter email but No password")
	public void enter_email_but_no_password() {
	// Write code here that turns the phrase above into concrete actions
	//throw new io.cucumber.java.PendingException();
		System.out.println("When Email Provided");
	JSONObject j = new JSONObject();
	j.put("email", "sydney@fife");
	httpRequest = given().header("content-type","application/json").
			body(j.toJSONString());
	response = httpRequest.post("/api/register");
	System.out.println("When Ended");
	}
	@Then("Validate Response")
	public void validate_response() {
		System.out.println("Then vailidate the status code");
	// Write code here that turns the phrase above into concrete actions
	//throw new io.cucumber.java.PendingException();
	Assert.assertEquals(response.getStatusCode(), 404);
	System.out.println(response.getStatusCode());
	System.out.println("Then Ended");
	}




}
