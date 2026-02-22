package client;

import static io.restassured.RestAssured.*;

import java.util.Map;

import endpoints.Routes;
import io.restassured.response.Response;

public class AuthClient {

    public static Response createClient(Map<String, Object> payload) {

        Response response =
        given()
            .header("Content-Type", "application/json")
            .body(payload)

        .when()
            .post(Routes.AUTH)

        .then()
            .extract()
            .response();

        return response;
    }
}
