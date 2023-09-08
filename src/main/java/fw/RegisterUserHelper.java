package fw;

import model.NewUser;
import org.openqa.selenium.WebDriver;

public class RegisterUserHelper extends BaseHelper {
    public RegisterUserHelper(WebDriver driver) {
        super(driver);
    }



    public void pickSexOfUser(Integer sex) {
        if (sex == 1) clickOnElement("#gender-male");
        if (sex == 0) clickOnElement("#gender-female");
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
