package Steps;
import java.util.concurrent.TimeUnit;
import Util.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps extends TestBase{
	
	@After
	public void TestCleanup() {
		driver.close();
		driver.quit();
	}	
	
	@Given("the browser is opened")
	public void the_browser_is_opened() throws Throwable {
		SetDriverType(DriverType.WEB, FrontEndType.CHROME);			
	}
	
	@And("the user is in the home page")
	public void the_user_is_in_home_page() throws Throwable {
		HomePage.NavigateToHomePage();				
	}

	@When("the user navigate to the login page")
	public void the_user_navigate_to_the_login_page() throws InterruptedException, Throwable {
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
		HomePage.NavigateToHomePage("Login");
	}
	
	@Given("^the user enters valid (.*) and (.*)$")
	public void the_user_enters_valid_username_and_password(String username, String password) throws InterruptedException, Throwable{
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
		LoginPage.EnterUserAndPass(username, password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException, Throwable {
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
	    LoginPage.clickAcessarConta();
	}	
	
	@Then("^user is navigated to the logged home page")
	public void user_is_navigated_to_the_logged_home_page() throws InterruptedException, Throwable {
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
		HomePage.ValidateLoggedHomePage();
	}
	
	@Given("^the user enters invalid (.*) and (.*)$")
	public void the_user_enters_invalid_username_and_password(String username, String password) throws InterruptedException, Throwable{
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
		LoginPage.EnterUserAndPass(username, password);
	}
	
	
	@Then("^user is shown with the proper failure (.*)$")
	public void user_is_shown_with_the_proper_failure_message(String expectedErrorMessage) throws InterruptedException, Throwable{
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing		
		HomePage.ValidateErrorFaildLogin(expectedErrorMessage);
		TimeUnit.SECONDS.sleep(2); //add the explicitly sleeping just to turn it better in the actions viewing
	}	    
}
