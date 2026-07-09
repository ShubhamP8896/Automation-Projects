package productsList;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import utilities.ConfigReader;

public class P001GetAllProducts 
{
	static String baseURL = ConfigReader.getProperty("baseURL");
	@Test
	public void getAllProducts()
	{
		given()
			.baseUri(baseURL)
		.when()
			.get("/products")
		.then()
			.statusCode(200)
			.log().all();
	}

}
