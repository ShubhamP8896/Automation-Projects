package productsList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPracticeSampleCode_1 
{
	@Test
	public void getResponce() 
	{
		Response response = RestAssured.get("https://simple-grocery-store-api.click/products");
		
		System.out.println("Status code : " + response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
	}

}
