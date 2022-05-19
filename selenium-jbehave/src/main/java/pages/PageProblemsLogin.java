package pages;

import attributes.AttributesProblemsLogin;

import static utils.DriverManager.driver;

public class PageProblemsLogin extends AttributesProblemsLogin {

    public boolean userNotExists(String user) {
        return invalid_username_message(user) == null;
    }

    public void locateAccount() {
        driver().get("https://www.facebook.com/recover/initiate/?ars=facebook_login");
    }
}
