package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefination" }, monochrome = true,
//	  tags= " @new",
//	  tags= "@post",
//	  tags= "@getMethod",
//	  tags= "@negativeScenario",
	 // tags = "@negativeScenario1",
	 // tags = "@date",
		//	tags= "@tag1",
			plugin = {
//					"pretty", "html:target/reports/index.html",
//					"pretty", "json:target/reports/cucumber.json",
//	                "pretty", "junit:target/reports/cucumber.xml",
					"pretty", "testng:target/reports/cucumber.xml"
					})
	public class TestRunner {
}
