package practice_restFul_Booker;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A001_TokenManager extends A001_BaseTest
{
	String token = "";
	
	@Test
	public static void getToken()
	{
		Map<String, String> body = new HashMap<String, String>();
		body.put("username", "admin");
		body.put("password", "password123");
	
		String token =
		given()
			.body(body)
			.header("Content-Type","application/json")
		.when()
			.post("/auth")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().body()
			.extract()
			.path("token");
		
		Assert.assertNotNull(token, "Token is Null");
		
		System.out.println(token);
	}
}
