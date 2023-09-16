package fw;

import model.NewUser;
import org.openqa.selenium.WebDriver;

public class RegisterUserHelper extends BaseHelper {
    public RegisterUserHelper(WebDriver driver) {
        super(driver);
    }



    public void pickSexOfUser(Boolean sex) {
        if (sex) clickOnElement("#gender-male");
        if (!sex) clickOnElement("#gender-female");
    }

    public void fillRegisterForm(NewUser newUser) {
        fillField(newUser.getFirstName(), "#FirstName");
        fillField(newUser.getLastName(), "#LastName");
        fillField(newUser.getEmail(), "#Email");
        fillField(newUser.getPassword(), "#Password");
        fillField(newUser.getConfirmPassword(), "#ConfirmPassword");
    }

    public void clickOnRegisterButton() {
        clickOnElement("#register-button");
    }
}
