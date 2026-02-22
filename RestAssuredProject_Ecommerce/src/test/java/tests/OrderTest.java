package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import client.OrderClient;
import io.restassured.response.Response;
import payload.OrderPayload;
import utils.TokenManager;

public class OrderTest extends BaseTest {

    String token;
    String orderId;

    @BeforeClass
    public void setupToken() {

        token = TokenManager.getToken();

        System.out.println("Token = " + token);

    }


    @Test(priority = 1)
    public void createOrderTest() {

        Response response =
                OrderClient.createOrder(
                        token,
                        OrderPayload.createOrderPayload(
                                CartTest.cartId,
                                "Shubham"
                        )
                );

        response.prettyPrint();

        orderId = response.jsonPath().getString("orderId");

        Assert.assertEquals(response.statusCode(), 201);

    }


    @Test(priority = 2)
    public void getOrderTest() {

        Response response =
                OrderClient.getSingleOrder(token, orderId);

        response.prettyPrint();

        Assert.assertEquals(response.statusCode(), 200);

    }

}
