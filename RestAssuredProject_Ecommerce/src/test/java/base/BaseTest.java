package base;

import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import endpoints.Routes;

public class BaseTest {

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = Routes.BASE_URL;

    }
}
