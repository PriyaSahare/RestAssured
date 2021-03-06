package stepDefination;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	import static io.restassured.RestAssured.*;
	import org.json.simple.JSONObject;
	import org.testng.Assert;
	public class SdAssign2 {
	Response response;
	RequestSpecification request;

	@Given("URI, Body and content type")
	public void uri_body_and_content_type() {

	JSONObject p = new JSONObject();
	p.put("name", "Priya");
	p.put("job", "Systems Engineer");
    
	System.out.println("Given Execution Started");
	RestAssured.baseURI = "https://reqres.in/api/users";
	request = given().log().all().header("content-type","application/json").
	body(p.toJSONString());
    System.out.println("Given ends");
	}
	@When("Poviding EndPoint")
	public void poviding_end_point() {
	System.out.println("When Started");
	response = request.post("api/users").then().log().all().extract().response();
	System.out.println("When ends");

	}
	@Then("Validating the Response Code & Logging in Console")
	public void validating_the_response_code_logging_in_console() {

	System.out.println("Then Started");
	System.out.println(response.getStatusCode());
	Assert.assertEquals(response.getStatusCode(),201);

	System.out.println("Then ends");

	}
	}