package pages;

import attributes.AttributesLocateAccount;
import utils.DriverManager;

import static utils.DriverManager.driver;

public class PageLocateAccount extends AttributesLocateAccount {

    public void locate(String phone) {
        if (driver() == null)
            DriverManager.launchBrowser();
        driver().get("https://pt-br.facebook.com/recover/initiate/?ars=facebook_login");
        phone().clear();
        phone().sendKeys(phone);
        phone().submit();

        // Nenhum resultado para a pesquisa?
        if (noSearchResults()) {
            System.out.println("Should log this...");
            System.out.println("No user matches given phone or email.");
        }

        try {
            //gives you some time to look at it
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DriverManager.quit();

    }
}
