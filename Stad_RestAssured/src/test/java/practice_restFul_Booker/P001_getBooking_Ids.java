package practice_restFul_Booker;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class P001_getBooking_Ids extends A001_BaseTest
{
	@Test(priority = 1)
	public void getBookingAllIds()
	{
		Response response =
		when()
			.get("/booking")
		.then()
			.statusCode(200)
			.statusLine(containsString("OK"))
//			.statusLine("HTTP/1.1 200 OK")    Or direct pass this
			.log().body()
			.extract()
			.response();
		
		Assert.assertNotNull(response);
	}	
}
