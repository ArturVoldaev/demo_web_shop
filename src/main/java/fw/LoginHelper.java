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

    public void logInCabinet(String userName, String password) {
        login(new NewUser().setEmail(userName).setPassword(password));
        clickOnElement("input[value='Log in']");
    }

}
