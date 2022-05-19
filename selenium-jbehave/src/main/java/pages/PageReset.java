package pages;

import attributes.AttributesReset;
import utils.DriverManager;

import static utils.DriverManager.driver;

public class PageReset extends AttributesReset {

    public void resetPassword(String phone) {
        //driver().get("https://www.facebook.com/recover/initiate/?ars=facebook_login");
        forgottenPasswordLink().click();
        email().clear();
        email().sendKeys(phone);
        search().click();

        try {
            // time for appreciating the landscape
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DriverManager.quit();
        /*
        Demo ends here: requires clicking on email link.
         */
    }

}
