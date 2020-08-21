package pages;

import attributes.AttributesHome;
import attributes.AttributesSecurityAndLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.DriverManager.driver;

public class PageSecurityAndLogin extends AttributesSecurityAndLogin {

    public void resetOwnPassword(String currentPassword, String newPassword) {
        driver().get("https://www.facebook.com/settings?tab=account&section=password&view");

        try {
            // Unfortunately have to use this fixed wait as Selenium is not waiting
            // for the page to load completely before moving on to switching frame
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // switch frame
        final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

        driver().switchTo().frame(iframes.get(0));

        currentPassword().clear();
        currentPassword().sendKeys(currentPassword);
        newPassword().clear();
        newPassword().sendKeys(newPassword);
        confirmPassword().clear();
        confirmPassword().sendKeys(newPassword);

        driver().switchTo().defaultContent();

        //click Salvar alterações- not implemented
        // our demo ends here.
    }

}
