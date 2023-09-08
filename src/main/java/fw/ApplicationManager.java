package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;
    BaseHelper baseHelper;
    RegisterUserHelper registerUserHelper;

    public BaseHelper getBaseHelper() {
        return baseHelper;
    }
    public RegisterUserHelper getRegisterUserHelper() {
        return registerUserHelper;
    }

    public void stop() {
        driver.quit();
    }
    public void init() {
        final String URL = "https://demowebshop.tricentis.com";
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        baseHelper = new BaseHelper(driver);
        registerUserHelper = new RegisterUserHelper(driver);

    }
}
