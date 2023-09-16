package fw;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

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

    public boolean isElementDisplayed(String cssLocator) {
        return getSizeElementsOnPage(cssLocator) > 0;
    }

    public int getSizeElementsOnPage(String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector)).size();
    }

    public void logOut() {
        clickOnElement(".ico-logout");
    }

    public boolean isElementNotDisplayed(String cssLocator) {
        return getSizeElementsOnPage(cssLocator) == 0;
    }

}
