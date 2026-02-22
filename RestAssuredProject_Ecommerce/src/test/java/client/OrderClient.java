package client;

import static io.restassured.RestAssured.*;

import endpoints.Routes;
import io.restassured.response.Response;

public class OrderClient {

    public static Response createOrder(String token, Object payload) {

        return
        given()
            .header("Content-Type", "application/json")
            .auth().oauth2(token)
            .body(payload)

        .when()
            .post(Routes.CREATE_ORDER)

        .then()
            .extract()
            .response();
    }


    public static Response getAllOrders(String token) {

        return
        given()
            .auth().oauth2(token)

        .when()
            .get(Routes.GET_ALL_ORDERS)

        .then()
            .extract()
            .response();
    }


    public static Response getSingleOrder(String token, String orderId) {

        return
        given()
            .auth().oauth2(token)
            .pathParam("orderId", orderId)

        .when()
            .get(Routes.GET_SINGLE_ORDER)

        .then()
            .extract()
            .response();
    }


    public static Response updateOrder(String token, String orderId, Object payload) {

        return
        given()
            .auth().oauth2(token)
            .header("Content-Type", "application/json")
            .pathParam("orderId", orderId)
            .body(payload)

        .when()
            .patch(Routes.UPDATE_ORDER)

        .then()
            .extract()
            .response();
    }


//    public static Response deleteOrder(String token, String orderId) {
//
//        return
//        given()
//            .auth().oauth2(token)
//            .pathParam("orderId", orderId)
//
//        .when()
//            .delete(Routes.DELETE_ORDER)
//
//        .then()
//            .extract()
//            .response();
//    }

}
