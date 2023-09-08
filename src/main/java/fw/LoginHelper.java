package fw;

import model.NewUser;
import org.openqa.selenium.WebDriver;

public class LoginHelper extends BaseHelper {
    public LoginHelper(WebDriver driver) {
        super(driver);
    }



    public void login(NewUser newUser) {
        fillField(newUser.getEmail(), "#Email");
        fillField(newUser.getPassword(), "#Password");
    }
    public void loginWithStandartUser() {
        login(new NewUser().setEmail(STANDARD_USER).setPassword(STANDARD_PASSWORD));
        clickOnElement("input[value='Log in']");
    }

}
