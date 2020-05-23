package tests;

import static org.testng.Assert.assertFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class CatFactsAPITest {

	@Test
	
public void requestRandomCatFact()
	{
		RestAssured.baseURI = "https://cat-fact.herokuapp.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/facts/random");
		ResponseBody body = response.getBody();
		JsonPath jsonPathEvaluator = response.jsonPath();
		String factText = jsonPathEvaluator.get("text");
		String resbonsetext = jsonPathEvaluator.get("text");
		String resbonsesource = jsonPathEvaluator.get("source");
		String resbonsetype = jsonPathEvaluator.get("type");
		assertFalse(factText.isEmpty());
		 System.out.println("fact is =>  " + factText);
		 Reporter.log("Fact is : " + resbonsetext);
		 Reporter.log("Source is :  " + resbonsesource );
		 Reporter.log("type is : " + resbonsetype);
		 Reporter.log("full response body is : " + body.asString());
	}
}
