package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Elements.elementExists;
import static utils.Elements.getWebElement;

public class AttributesLocateAccount {

    protected WebElement phone() {
        return getWebElement(By
                .id("identify_email"));
    }

    protected boolean noSearchResults() {
        return elementExists(By.xpath("//div[@class='pam uiBoxRed']/div[contains(.,'Nenhum resultado')]"), 10);
    }

}
