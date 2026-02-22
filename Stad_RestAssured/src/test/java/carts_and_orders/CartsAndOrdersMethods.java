package carts_and_orders;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


/// Create an new Cart
public class CartsAndOrdersMethods 
{
	String cartId;
	int itemId;
	String orderId;
	String accessToken = "97e8c967b9a644c5c1bc8dc5a9afc7d6a6e39e1e452fff205cdc5e52bc560ac0";
	
	@BeforeMethod
	public void setup()
	{
		RestAssured.baseURI = "https://simple-grocery-store-api.click";
	}
	
	@Test(priority = 1)
	public void createAndGetCart()
	{
		System.out.println("TC-001");
		cartId = 
				given()
				.when()
					.post("/carts")
				.then()
					.statusCode(201)
					.log().body()
					.extract()
					.path("cartId");
		System.out.println("cart ID = " + cartId);
		
		Assert.assertNotNull(cartId, "Cart ID should not be null");
	}

/// Add an item into cart
	@Test(priority = 2, dependsOnMethods = "createAndGetCart")
	public void addItemsIntoCart()
	{
		System.out.println("TC-002");
		int productID = 3674;
		int quantity = 2;
		
		 String requestBody = "{\"productId\" : " + productID + ", \"quantity\": " + quantity + "}";
		
//		 we used / (slash) because we used key (productId) in the double quotes, The \" characters 
//		 are necessary inside a Java string literal to represent the literal double quotes required by the JSON format.
		 
//		OR
		
		Map<String, Object> body = new HashMap<>();
		body.put("productId", productID);
		body.put("quantity", quantity);
		
		given()
			.header("Content-Type", "application/json")
			.pathParam("cartID", cartId)
			.body(body)                           // here we need to pass body/requestBody as per we use
		.when()
			.post("/carts/{cartID}/items")
		.then()
			.statusCode(201)
			.log().body();
	}
	
/// Get cart
	@Test(priority = 3, dependsOnMethods = "addItemsIntoCart")
	public void getCart()
	{
		System.out.println("TC-003");
		 Assert.assertNotNull(cartId, "Cart ID is null. Cart creation might have failed.");
		
		given()
			.pathParam("cartID", cartId)
		.when()
			.get("/carts/{cartID}")
		.then()
			.statusCode(200)
			.log().body();
		
		System.out.println(cartId);
	}
	
	
	/// Get cart
	@Test(priority = 4, dependsOnMethods = "addItemsIntoCart")
	public void getCartItems()
	{
		System.out.println("TC-004");
		Assert.assertNotNull(cartId, "Cart ID is null. Cart creation might have failed.");
		itemId =
			given()
				.pathParam("cartID", cartId)
			.when()
				.get("/carts/{cartID}/items")
			.then()
				.statusCode(200)
				.log().body()
				.extract()
				.path("[0].id");
		Assert.assertNotNull(itemId);
		System.out.println("itemId = " + itemId);
				
		}
	
	/// Modify an items from the cart
	@Test(priority = 5, dependsOnMethods = "getCartItems")
	public void modifyCartItems()
	{
		System.out.println("TC-005");
		Assert.assertNotNull(itemId);
		Assert.assertNotNull(cartId);
		
		int quantity = 2;
		
		String requestBody = "{\"quantity\" : " + quantity + "}" ;  //"{\"productId\" : " + productID + ", \"quantity\": " + quantity + "}";
		
		given()
			.pathParam("cartId", cartId)
			.pathParam("itemId", itemId)
			.body(requestBody)
			.header("Content-Type" , "application/json")
		.when()
			.patch("/carts/{cartId}/items/{itemId}")
		.then()
			.statusCode(204)
			.log().body();		
	}
	
	@Test(priority = 6, dependsOnMethods = "getCartItems" )
	public void replaceItemFromCart()
	{
		System.out.println("TC-006");
		Assert.assertNotNull(itemId);
		Assert.assertNotNull(cartId);
		
		int productId = 3674;
		int quantity = 1;
		
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("productId", productId);
		body.put("quantity", quantity);
		
		given()
			.pathParam("cartId", cartId)
			.pathParam("itemId", itemId)
			.headers("Content-Type","application/json")
			.body(body)
		.when()
			.put("/carts/{cartId}/items/{itemId}")
		.then()
			.statusCode(204)
			.log().body();
	}
	
//	@Test(priority = 7, dependsOnMethods = "addItemsIntoCart" )
//	public void DeleteCart()
//	{
//		System.out.println("TC-007");
//		Assert.assertNotNull(itemId);
//		Assert.assertNotNull(cartId);
//		
//		given()
//			.pathParam("cartId", cartId)
//			.pathParam("itemId", itemId)
//		.when()
//			.delete("/carts/{cartId}/items/{itemId}")
//		.then()
//			.statusCode(204)
//			.log().body();
//	}

	@Test(priority = 8, dependsOnMethods = "addItemsIntoCart" )
	public void createNewOrder()
	{
		
		System.out.println("TC-008");
		Assert.assertNotNull(cartId);
		System.out.println(accessToken);
		
		Map<String, Object> body = new HashMap<>();
	    body.put("cartId", cartId);
	    body.put("customerName", "Shubham P");
	Response responce=
		given()
			.headers("Content-Type", "application/json")
			.headers("Authorization", accessToken ) //OR  .auth().oauth2(accessToken)  // how we passed Auth. If the token is bearer then use "bearer " + accessToken 		
			.body(body)
		.when()
			.post("/orders")
		.then()
			.statusCode(201)
			.log().body()
			.extract()
			.response();
	orderId = responce.jsonPath().getString("orderId");
	System.out.println("Order ID = "+orderId);
	}
	
	@Test(priority = 9, dependsOnMethods = "createNewOrder")
	public void getAllOrders()
	{
		System.out.println("TC-009");
		given()
			.auth().oauth2(accessToken)
		.when()
			.get("/orders")
		.then()
			.statusCode(200)
			.log().body();
	}
	
	@Test(priority = 10, dependsOnMethods = "createNewOrder")
	public void getSingleOrder()
	{
		System.out.println("TC-010");

		given()
			.auth().oauth2(accessToken)
			.pathParam("orderId", orderId)
		.when()
			.get("/orders/{orderId}")
		.then()
			.statusCode(200)
			.log().body();		
	}
	
	@Test(priority = 11, dependsOnMethods = "createNewOrder")
	public void updateOrder()
	{
		System.out.println("TC-011");
		
		Map<String,Object> body = new HashMap<>();
		body.put("customerName", "Shubham P");
		body.put("comment", "Orders are completed");
		
		given()
			.auth().oauth2(accessToken)
			.pathParam("orderId", orderId)
			.headers("Content-Type","application/json")
			.body(body)
		.when()
			.patch("/orders/{orderId}")
		.then()
			.statusCode(204);		
	}
	
	@Test(priority = 13, dependsOnMethods = "createNewOrder")
	public void deleteOrder()
	{
		System.out.println("TC-012");
		
		Map <String, String> body = new HashMap<>();
		body.put("customerName", "Shubham P");
		
		given()
			.auth().oauth2(accessToken)
			.headers("Content-Type","application/json")
			.pathParam("orderId", orderId)
			.body(body)
		.when()
			.delete("/orders/{orderId}")
		.then()
			.statusCode(204)
			.log().body();
		System.out.println(orderId);		
	}
	
	
	
	
	
	
}
