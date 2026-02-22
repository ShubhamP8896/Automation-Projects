package productsList;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllProductsList 
{
	@Test
	public void getResponse() {
//		BDD style Industry standard
				
		given()
		
		.when()
		.get("https://simple-grocery-store-api.click/products")
		
		.then()
		.statusCode(200)
		.log().body();
		
	}

}
