package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.DriverManager.driver;

public class Elements {

    final static int COMMON_RESOLVE_TIME = 30;

    public static WebElement getWebElement(By locator) {
        return getWebElement(locator, COMMON_RESOLVE_TIME);

    }

    public static WebElement getWebElement(By locator, int resolve) {
        try {
            return new WebDriverWait(driver(), resolve)
                    .until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception ignore) {

        }
        return null;
    }

    public static boolean elementExists(By locator, int resolve) {

        boolean elementExists = false;

        try {
            WebElement webElement = new WebDriverWait(driver(), resolve)
                    .until(ExpectedConditions.presenceOfElementLocated(locator));
            elementExists = true;
        } catch (Exception ignore) {

        }

        return elementExists;
    }

    public static boolean elementExists(By locator) {
        return elementExists(locator, COMMON_RESOLVE_TIME);
    }

}
