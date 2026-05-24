package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import client.ProductClient;
import io.restassured.response.Response;

public class ProductTest extends BaseTest {

    @Test
    public void verifyGetAllProducts() 
    {

        Response response = ProductClient.getAllProducts();

        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
    
    @Test
    public void verifyGetSingleProduct()
    {
    	Response response = ProductClient.getSingleProduct(3486);
    	
    	response.prettyPrint();
    	
    	Assert.assertEquals(response.getStatusCode(), 200);
    }

}
