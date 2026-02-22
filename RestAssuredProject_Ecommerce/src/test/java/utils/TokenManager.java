package utils;

import client.AuthClient;
import payload.AuthPayload;
import io.restassured.response.Response;

public class TokenManager {

    public static String getToken() {

        String email = "test_" + System.currentTimeMillis() + "@yopmail.com";

        Response response =
                AuthClient.createClient(
                        AuthPayload.createClientPayload("Shubham", email)
                );

        response.then().statusCode(201);

        String token =
                response.jsonPath().getString("accessToken");

        return token;
    }
}
