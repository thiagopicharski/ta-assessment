package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Util.TestBase;
import Util.Helpers;

public class LoginPage extends TestBase{			
	
	/*---------------------------------ELEMENTS---------------------------------*/
	public static By fldUsername() {
		return By.id("username");
	}	
	
	public static By fldPassword() {
		return By.id("password");
	}	
	
	public static By btnAcessarConta() {
		return By.id("login-button");
	}
	
	/*---------------------------------ACTIONS---------------------------------*/
	public static void fillUsername(String user) {
		Helpers.SendKeys(fldUsername(), user);
	}

	public static void fillPassword(String pass) {
		Helpers.SendKeys(fldPassword(), pass);
	}
	
	public static void clickAcessarConta() {
		Helpers.Click(btnAcessarConta());
	}
	
	/*---------------------------------BEHAVIORS---------------------------------*/
	public static void EnterUserAndPass(String user, String pass) {
		fillUsername(user);
		fillPassword(pass);
	}
}
