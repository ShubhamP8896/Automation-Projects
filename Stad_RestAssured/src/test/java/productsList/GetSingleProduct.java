package productsList;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetSingleProduct 
{
	static int id = 2585;
    static String baseUrl = "https://simple-grocery-store-api.click";

    @Test
	public void getResponse() {

        given()
            .baseUri(baseUrl)
            .pathParam("productId", id)              //OR  .pathParam("productId", 2585)  

        .when()
            .get("/products/{productId}")
            
//      OR we are able to give direct URL in the When() > In the the give we didn't pass the path parameters directly static url pass in the get().
//            .when()
//             .get("URL")
            
        .then()
            .statusCode(200)
            .log().body();
		
	}

}
