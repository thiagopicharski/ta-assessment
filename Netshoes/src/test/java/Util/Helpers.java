package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helpers extends TestBase {
	
	public static By Click(By by) {
		driver.findElement(by).click();
		return by;
	}
	
	public static By SendKeys(By by, String text) {
		driver.findElement(by).sendKeys(text);
		return by;
	}
	
	public static By Select(By by, String text) {
		Select dropBox = new Select(driver.findElement(by));
		dropBox.selectByVisibleText(text);
		return by;
	}
	
	public static void NavigateTo(String text) {
		driver.navigate().to(text); 
	}
	
	public static void HoverElement(String element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@"+element+"]"))).perform();
	}
	
	public static String GetText(By by) {
		return driver.findElement(by).getText();		
	}
	
}
