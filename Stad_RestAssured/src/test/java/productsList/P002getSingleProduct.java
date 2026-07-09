package productsList;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import utilities.ConfigReader;

public class P002getSingleProduct {

	static String basURL = ConfigReader.getProperty("baseURL");
	
	@Test
	public void getSingleProduct()
	{
		Response response =
		given()
			.baseUri(basURL)
			.pathParam("productId", 2585)
		.when()
			.get("/products/{productId}")
		.then()
			.statusCode(200)
			.log().body()
			.extract()
			.response();
		
		String category = response.jsonPath().getString("category");
		
		Assert.assertEquals(category, "fresh-produce");
		
	}
	
}
