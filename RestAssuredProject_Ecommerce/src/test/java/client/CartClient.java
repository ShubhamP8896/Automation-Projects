package client;

import static io.restassured.RestAssured.*;

import endpoints.Routes;
import io.restassured.response.Response;

public class CartClient {

    public static Response createCart() {

        return
        given()

        .when()
            .post(Routes.CREATE_CART)

        .then()
            .extract()
            .response();
    }


    public static Response addItem(String cartId, Object payload) {

        return
        given()
            .pathParam("cartId", cartId)
            .header("Content-Type", "application/json")
            .body(payload)

        .when()
            .post(Routes.ADD_ITEM)

        .then()
            .extract()
            .response();
    }


    public static Response getCart(String cartId) {

        return
        given()
            .pathParam("cartId", cartId)

        .when()
            .get(Routes.GET_CART)

        .then()
            .extract()
            .response();
    }


    public static Response getCartItems(String cartId) {

        return
        given()
            .pathParam("cartId", cartId)

        .when()
            .get(Routes.GET_CART_ITEMS)

        .then()
            .extract()
            .response();
    }


    public static Response modifyItem(String cartId, int itemId, Object payload) {

        return
        given()
            .pathParam("cartId", cartId)
            .pathParam("itemId", itemId)
            .header("Content-Type", "application/json")
            .body(payload)

        .when()
            .patch(Routes.MODIFY_ITEM)

        .then()
            .extract()
            .response();
    }


    public static Response replaceItem(String cartId, int itemId, Object payload) {

        return
        given()
            .pathParam("cartId", cartId)
            .pathParam("itemId", itemId)
            .header("Content-Type", "application/json")
            .body(payload)

        .when()
            .put(Routes.REPLACE_ITEM)

        .then()
            .extract()
            .response();
    }

}
