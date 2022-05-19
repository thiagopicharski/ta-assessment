package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class authSteps {


    @Given("I can log in into the application by entering a registered {string} and {string}")
    public void asAUserICanLogInIntoTheApplicationByEnteringARegisteredAnd(String user, String password) {

        new PageLogin().login(user, password);

        /*
        If password field does not show up, user is logged in on Facebook.
        Not the best idea for a verification yet useful for Facebook public facing app
         */
        //assertThat(new PageLogin().isPasswordFieldDisplayed(), is(false)); // if false then success
    }


    @And("I can reset my own password to {string} from {string}")
    public void iCanResetMyOwnPassword(String newPassword, String currentPassword) {
       new PageHome().goToResetPassword();
       new PageSecurityAndLogin().resetOwnPassword(currentPassword, newPassword);
       /*
       Our demo ends here before saving new password
        */
       new PageHome().logout();
    }

    @And("I have forgotten my password")
    public void iHaveForgottenMyPassword() {

        /*
        Using password field existence for password error
         */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat(new PageLogin().isPasswordFieldDisplayed(), is(true)); // if not false then good to reset
    }

    @Then("I can reset my password using my {string}")
    public void iCanResetMyPassword(String phone) {

        new PageReset().resetPassword(phone);
         /*
        Our demo ends here as this requires clicking on link within email
         */

    }

    @But("I have forgotten my {string}")
    public void iHaveForgottenMy(String user) {
        new PageProblemsLogin().locateAccount();
    }

    @Then("I can recover my username using my registered {string} and {string}")
    public void iCanRecoverMyUsernameUsingMyRegistered(String phone, String fullName) {
        new PageLocateAccount().locate(phone.trim());
        //assertThat(new PageLogin().password(), is(IsNull.notNullValue()));
        //assertThat(new PageLogin().fullNameExists(fullName.trim()), is(true));
    }
}
