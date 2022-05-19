package pages;

import attributes.AttributesLogin;
import utils.DriverManager;

import static utils.DriverManager.driver;

public class PageLogin extends AttributesLogin {

    public void login(String user, String password) {

        if (driver() == null)
            DriverManager.launchBrowser();

        driver().manage().window().maximize();
        driver().get("https://pt-br.facebook.com/");
        email().clear();
        email().sendKeys(user);
        password().clear();
        password().sendKeys(password);
        login().click();
    }

    public boolean isPasswordFieldDisplayed() {
        try {
            if (password().isDisplayed())
                return true;
        } catch (Exception ignore) {

        }
        return false;
    }

    public boolean fullNameExists(String fullName) {

        return fullName(fullName) != null;
    }
}
