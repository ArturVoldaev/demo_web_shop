package com.demowebshop.automattest;

import org.testng.annotations.Test;


public class LoginPageTest  extends TestBase {
    @Test
    public void loginUserPositiveTest() {
        app.getRegisterUserHelper().redirectTo(".ico-login");
        app.getLoginHelper().loginWithStandartUser();
    }
}
