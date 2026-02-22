package client;

import static io.restassured.RestAssured.*;

import endpoints.Routes;
import io.restassured.response.Response;

public class ProductClient {

    public static Response getAllProducts() {

        return
        given()

        .when()
            .get(Routes.GET_ALL_PRODUCTS)

        .then()
            .extract().response();
    }

    public static Response getSingleProduct(int productId) {

        return
        given()
            .pathParam("productId", productId)

        .when()
            .get(Routes.GET_SINGLE_PRODUCT)

        .then()
            .extract().response();
    }
}
