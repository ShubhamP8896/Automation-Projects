package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.TokenManager;

public class AuthTest extends BaseTest {

    @Test
    public void verifyAuth() {

        String token = TokenManager.getToken();

        System.out.println("Token = " + token);

        Assert.assertNotNull(token);

    }
}
