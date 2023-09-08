package com.demowebshop.automattest;

import model.NewUser;
import org.testng.annotations.Test;
import utils.DataProviders;


public class RegisterPageTest extends TestBase {

    @Test(dataProvider = "dataForNewUser", dataProviderClass = DataProviders.class)
    public void registerUser(Integer sex, String firstName, String lastName, String email, String password, String confirmPassword) {
        app.getRegisterUserHelper().redirectToPageRegister();
        app.getRegisterUserHelper().pickSexOfUser(sex);
        app.getRegisterUserHelper().fillRegisterForm(new NewUser()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setConfirmPassword(confirmPassword));
        app.getRegisterUserHelper().clickOnRegisterButton();
        app.getBaseHelper().logOut();
    }
}
