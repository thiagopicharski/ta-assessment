package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Elements.getWebElement;

public class AttributesSecurityAndLogin {

    protected WebElement fullName(String fullName) {
        return getWebElement(By
                .xpath("//span[normalize-text()='" + fullName + "')]"), 10);
    }

    protected WebElement currentPassword() {
        return getWebElement(By.xpath("//input[@id='password_old']"));
    }

    protected WebElement newPassword() {
        return getWebElement(By.xpath("//input[@id='password_new']"));
    }

    protected WebElement confirmPassword() {
        return getWebElement(By.xpath("//input[@id='password_confirm']"));
    }

}
