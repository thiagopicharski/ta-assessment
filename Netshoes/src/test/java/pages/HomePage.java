package pages;
import org.openqa.selenium.By;
import Util.TestBase;
import Util.Helpers;
import static org.junit.Assert.*;
import org.junit.Test;

public class HomePage extends TestBase{			
	
	/*---------------------------------ELEMENTS---------------------------------*/
	public static String ddlEntrar() {
		String xpath = "qa-automation='home-account-button'";
		return xpath;
	}	
	
	public static By linkTextLogin(String text) {
		return By.linkText(text);
	}	
	
	public static By ddlUserNameLogged() {
		return By.id("username-logged");
	}
	
	public static By txtError() {
		return By.id("errors-wrapper");
	}
	
	/*---------------------------------ACTIONS---------------------------------*/
	public static void NavigateToHomePage() {
		Helpers.NavigateTo("https://www.netshoes.com.br/");
	}
	public static void HoverEntrar() {
		Helpers.HoverElement(ddlEntrar());
	}
	
	public static void SelectLogin(String text) {
		Helpers.Click(linkTextLogin(text));
	}
	
	public static String GetTextUsername() {
		return Helpers.GetText(ddlUserNameLogged());
	}
	
	public static String GetErrorShown() {
		return Helpers.GetText(txtError());
	}
	
	/*---------------------------------BEHAVIORS---------------------------------*/
	public static void NavigateToHomePage(String text) {
		HoverEntrar();
		SelectLogin(text);
	}
	
	public static void ValidateLoggedHomePage() {
		assertTrue(!GetTextUsername().isEmpty());
	}
	
	public static void ValidateErrorFaildLogin(String expectedErrorMessage) {
		assertEquals(expectedErrorMessage, GetErrorShown());
	}
}
