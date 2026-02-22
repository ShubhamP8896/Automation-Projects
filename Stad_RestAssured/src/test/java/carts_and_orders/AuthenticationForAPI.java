package carts_and_orders;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class AuthenticationForAPI 
{
	String clientName = "Shubham P";
	String clientEmail = "postman_" + System.currentTimeMillis() + "@yopmail.com";
	static String token;
	
	@BeforeMethod
	public void setup()
	{
		RestAssured.baseURI = "https://simple-grocery-store-api.click";
	}
	
	@Test(priority = 1)
	public void auth()
	{
		Map<String, Object> body = new HashMap<>();
		body.put("clientName", clientName);
		body.put("clientEmail", clientEmail);
	token =
		given()
			.headers("Content-Type" , "application/json")
			.body(body)
		.when()
			.post("/api-clients")
		.then()
			.statusCode(201)
			.log().body()
			.extract()
			.path("accessToken");
	Assert.assertNotNull(token);
	System.out.println("Token = " + token);
	}
	
	
//	OR
	
//	Map<String, Object> body = new HashMap<>();
//	body.put("clientName", clientName);
//	body.put("clientEmail", clientEmail);
//Response res =
//	given()
//		.headers("Content-Type" , "application/json")
//		.body(body)
//	.when()
//		.post("/api-clients")
//	.then()
//		.statusCode(201)
//		.log().body()
//		.extract()
//		.response();
//	
//	String token = res.jsonPath().hetString("accessToken");
//	
//Assert.assertNotNull(token);
//System.out.println("Token = " + token);
//	

}
