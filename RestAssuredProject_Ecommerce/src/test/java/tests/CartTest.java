package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import client.CartClient;
import io.restassured.response.Response;
import payload.CartPayload;

public class CartTest extends BaseTest {

    static String cartId;
    static int itemId;

    @Test(priority = 1)
    public void createCartTest() {

        Response response = CartClient.createCart();

        response.prettyPrint();

        cartId = response.jsonPath().getString("cartId");

        Assert.assertEquals(response.statusCode(), 201);

    }


    @Test(priority = 2)
    public void addItemTest() {

        Response response =
                CartClient.addItem(
                        cartId,
                        CartPayload.addItemPayload(3674, 2)
                );

        response.prettyPrint();

        Assert.assertEquals(response.statusCode(), 201);

    }


    @Test(priority = 3)
    public void getCartItemsTest() {

        Response response = CartClient.getCartItems(cartId);

        response.prettyPrint();

        itemId = response.jsonPath().getInt("[0].id");

        Assert.assertEquals(response.statusCode(), 200);

    }

}
