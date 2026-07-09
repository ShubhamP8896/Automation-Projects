package statusOfAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import utilities.ConfigReader;

public class P001Status 
{
	
	private static String baseURL = ConfigReader.getProperty("baseURL");
	
	@Test
	public void getStatus()
	{
		given()
			.baseUri(baseURL)
		.when()
			.get("/status")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.header("Content-Type", "application/json")
			.log()
			.all();
			
	}
	

}
