package carts_and_orders;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class P001_Authentication 
{
	String clientName = "Shubham";
	String clientEmail = "shubham" + System.currentTimeMillis() + "@yopmail.com";
	String token;
	String cartId;
	
	@BeforeSuite
	public void setUp()
	{
		RestAssured.baseURI = "https://simple-grocery-store-api.click";
	}
	
	@Test(priority = 1)
	public void verifyAuthentication()
	{
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("clientName", clientName);
		body.put("clientEmail", clientEmail);
		
		token = 
				given()
					.headers("Content-Type", "application/json")
					.body(body)
				.when()
					.post("/api-clients")
				.then()
					.statusCode(201)
					.extract()
					.path("accessToken");
		Assert.assertNotNull(token);
		
		System.out.println("Token = " + token);
	}
	
	@Test(priority = 2)
	public void createCart()
	{
		cartId=
			 given()
			 	.headers("Content-Type","application/json")
			.when()
				.post("/carts")
			.then()
				.statusCode(201)
				.extract()
				.path("cartId");
		
		Assert.assertNotNull(cartId);
		
		System.out.println("cart id = " + cartId);
	}
	
	@Test(priority = 3, dependsOnMethods = "createCart")
	public void addItemInCart()
	{
		Map<String, Object> body = new HashMap<>();
		body.put("productId", 8554);
		
		given()
			.headers("Content-Type","application/json")
			.body(body)
			.pathParam("cartId", cartId)
		.when()
			.post("/carts/{cartId}/items")
		.then()
			.statusCode(201);
	}

}
