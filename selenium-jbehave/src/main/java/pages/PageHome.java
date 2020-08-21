package pages;

import attributes.AttributesHome;
import org.openqa.selenium.Alert;

import static utils.DriverManager.driver;

public class PageHome extends AttributesHome {

    public void goToResetPassword() {
        driver().get("https://www.facebook.com/settings?tab=account&section=password&view");
    }

    public void logout() {
        accountOptions().click();
        logoutOption().click();
        driver.switchTo().alert().accept();
    }

}
