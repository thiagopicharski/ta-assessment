package Util;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {

	public enum DriverType {DESKTOP, MOBILE, WEB}
	public enum FrontEndType {ANDROID, IOS, CHROME, FIREFOX, IE, OPERA, SAFARI}
	public static DriverType DRIVERTYPE;
	public static FrontEndType FRONTENDTYPE;
	public static RemoteWebDriver driver;
	public ExtentReports extent;
	public static ExtentTest scenarioDef;
	public static ExtentTest features;	
	public String reportLocation = "C:/Users/andra/git/ta-assessment/Netshoes/target/";
	
	public static void SetDriverType(DriverType dt, FrontEndType fet) {					
		
		DRIVERTYPE = dt;
		FRONTENDTYPE = fet;
		
		switch (DRIVERTYPE) {
		case MOBILE:
			switch (FRONTENDTYPE) {
			case ANDROID:
				//ToDo
				break;
			case IOS:
				//ToDo
				break;				
			default:
				break;
			}
			break;
		case DESKTOP:
			switch (FRONTENDTYPE) {
			case IE:
				//ToDo
				break;
			case SAFARI:
				//ToDo
				break;
			default:
				break;
			}
		case WEB:
			switch (FRONTENDTYPE) {
			case CHROME:
				String projectPath = System.getProperty("user.dir");
			    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;
			case FIREFOX:
				//ToDo
				break;
			case OPERA:
				//ToDo
				break;
			default:
				break;
			}
		default:
			break;
		}	
	}	
}
