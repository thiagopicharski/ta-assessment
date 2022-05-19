package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Elements.getWebElement;

public class AttributesReset {

    protected WebElement search() {
        return getWebElement(By
                .name("did_submit")); //reset_action
    }

    protected WebElement email() {
        return getWebElement(By.id("identify_email"));
    }

    protected WebElement forgottenPasswordLink() {
        return getWebElement(By.xpath("//a[contains(.,'Esqueceu a senha?')]"));
    }

}
