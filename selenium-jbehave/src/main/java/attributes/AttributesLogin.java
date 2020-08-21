package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Elements.getWebElement;

public class AttributesLogin {

    final int QUICK_RESOLVE = 10;

    protected WebElement email() {
        return getWebElement(By.id("email"));
    }

//    public WebElement forward() {
//        return getWebElement(By.id("continue"));
//    }

    public WebElement password() {
        return getWebElement(By.id("pass"), QUICK_RESOLVE);
    }

    protected WebElement login() {
        return getWebElement(By.name("login"));
    }

    protected WebElement fullName(String fullName) {
        return getWebElement(By.xpath("//table[contains(.,'" + fullName + "')]"));
    }

}
