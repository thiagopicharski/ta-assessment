package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverManager.driver;
import static utils.Elements.getWebElement;

public class AttributesHome {

    protected WebElement fullName(String fullName) {
        return getWebElement(By
                .xpath("//span[normalize-text()='" + fullName + "')]"), 10);
    }

    protected WebElement search() {
        return getWebElement(By.xpath("//input[@type='search'"));
    }

    protected WebElement accountOptions() {
        return getWebElement(By.xpath("//div[@aria-label='Conta']"));
    }

    protected WebElement logoutOption() {
        return getWebElement((By.xpath("//span[contains(.,'Sair')]")));
    }

}
