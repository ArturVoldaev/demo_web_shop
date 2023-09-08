package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
    WebDriver driver;
    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public final String STANDARD_USER = "standart@yandex.com";

    public final String STANDARD_PASSWORD = "standart@yandex.com";


    public void clickOnElement (String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void redirectTo(String selectorUrl) {
        clickOnElement(selectorUrl);
    }

    public void fillField(String text, String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
        driver.findElement(By.cssSelector(cssSelector)).clear();
        driver.findElement(By.cssSelector(cssSelector)).sendKeys(text);
    }

    public void logOut() {
        clickOnElement(".ico-logout");
    }

}
