package practice_restFul_Booker;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utilities.ConfigReader;

public class A001_BaseTest 
{
	@BeforeClass
	public void setUp()
	{
		RestAssured.baseURI = ConfigReader.getProperty("baseUriBookings");
	}

}
