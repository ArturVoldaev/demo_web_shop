package com.demowebshop.automattest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginPageTest  extends TestBase {
    @Test
    public void loginUserPositiveTest() {
        app.getRegisterUserHelper().redirectTo(".ico-login");
        app.getLoginHelper().logInCabinet(app.getBaseHelper().STANDARD_USER, app.getBaseHelper().STANDARD_PASSWORD);
    }

    @Test
    @Parameters({"username", "password"})
    public void loginUserXmlParams(String username, String password) {
        app.getRegisterUserHelper().redirectTo(".ico-login");
        app.getLoginHelper().logInCabinet(username, password);
    }
}
