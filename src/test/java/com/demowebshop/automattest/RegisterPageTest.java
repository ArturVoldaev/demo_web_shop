package com.demowebshop.automattest;

import model.NewUser;
import org.testng.annotations.Test;
import utils.DataProviders;

public class RegisterPageTest extends TestBase {
    @Test(dataProvider = "dataForNewUser", dataProviderClass = DataProviders.class)
    public void registerUser(Boolean sex, String firstName, String lastName, String email, String password, String confirmPassword) {
        app.getRegisterUserHelper().redirectTo(".ico-register");
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

    @Test(expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
    public void UiExceptionTestEmailInputError() {
        app.getRegisterUserHelper().redirectTo(".ico-register");
        app.getBaseHelper().clickOnElement("#EmailFake");
    }

    @Test(expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
    public void UiExceptionTestPasswordInputError() {
        app.getRegisterUserHelper().redirectTo(".ico-register");
        app.getBaseHelper().clickOnElement("#PasswordFake");
    }
}
