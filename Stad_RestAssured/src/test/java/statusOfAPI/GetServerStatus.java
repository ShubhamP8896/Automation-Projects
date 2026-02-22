package statusOfAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

// (You’ll need import static org.hamcrest.Matchers.*; for equalTo.)

public class GetServerStatus 
{
//	static String baseUrl = "https://simple-grocery-store-api.click";
	
	@Test
	public void getResponse()
	{
//		Also we are able to define the base url > baseURI = "https://simple-grocery-store-api.click"; and then no need to call that from given or When
		
		baseURI = "https://simple-grocery-store-api.click";
		given()
//		.baseUri(baseUrl)           // we called the base URL      
		
		.when()
		.get("/status")
		
		.then()
		.statusCode(200)
		.body("status", equalTo("UP"))
		.log().body();
	}

}
