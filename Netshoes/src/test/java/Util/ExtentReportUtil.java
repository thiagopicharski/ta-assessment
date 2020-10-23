package Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil extends TestBase {
	String fileName = reportLocation + "extentreport.html";
	
	public void ExtentReport() {
		//First it to crate Extent Reports object
		extent = new ExtentReports();
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Test report from Extent Report");
		htmlReporter.config().setReportName("Test Report");
		
		extent.attachReporter(htmlReporter);
	}
	
	public void ExtentReportScreenshot() throws IOException{
		var scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
		//scenarioDef.fail("Failed");		
	}
	
	public void FlushReport() {
		extent.flush();
	}
	
	
}
