package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Elements.getWebElement;

public class AttributesProblemsLogin {

    protected WebElement invalid_username_message(String user) {

        try {
            return getWebElement(By
                    .xpath("//span[normalize-text()='\"" + user + "\" não está associado a nenhuma conta do Facebook.')]"));
        } catch (Exception ignore) {

        }

        return null;
    }

    protected WebElement locate() {
        return getWebElement(By.xpath("//a[@role='button'][2]"));
    }

}
